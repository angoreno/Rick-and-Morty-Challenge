package com.rickmorty.rmdesafio.service;

import com.rickmorty.rmdesafio.dto.OriginObjectSchema;
import com.rickmorty.rmdesafio.model.CharacterSchema;
import com.rickmorty.rmdesafio.model.LocationSchema;
import com.rickmorty.rmdesafio.dto.RootObjectSchema;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class RickMortyService {

    private static Logger LOGGER = Logger.getLogger(RickMortyService.class.getName());

    public RootObjectSchema rickMortyService(int id){

        String uriCharacter = "https://rickandmortyapi.com/api/character/" + id;
        RestTemplate restTemplate = new RestTemplate();
        CharacterSchema resultCharacter = restTemplate.getForObject(uriCharacter,CharacterSchema.class);
        String uriLocation = resultCharacter.getOrigin().getUrl();

        try{
            LocationSchema resultLocation = restTemplate.getForObject(uriLocation,LocationSchema.class);
            return buildingSchema(resultCharacter,resultLocation);
        }catch(Exception e){
            LOGGER.log(Level.WARNING,"origin url does not exist");
            return buildingSchema(resultCharacter,new LocationSchema());
        }

    }

    public RootObjectSchema buildingSchema(CharacterSchema characterSchema, LocationSchema locationSchema){

        RootObjectSchema dto = new RootObjectSchema();
        dto.setId(characterSchema.getId());
        dto.setName(characterSchema.getName());
        dto.setStatus(characterSchema.getStatus());
        dto.setSpecies(characterSchema.getSpecies());
        dto.setType(characterSchema.getType());
        dto.setEpisode_Count(characterSchema.getEpisode().length);
        dto.setOrigin(new OriginObjectSchema());
        dto.getOrigin().setName(locationSchema.getName());
        dto.getOrigin().setUrl(locationSchema.getUrl());
        dto.getOrigin().setDimension(locationSchema.getDimension());
        dto.getOrigin().setResidents(locationSchema.getResidents());

        return dto;
    }
}
