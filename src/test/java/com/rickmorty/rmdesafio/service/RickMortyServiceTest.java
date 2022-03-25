package com.rickmorty.rmdesafio.service;

import com.rickmorty.rmdesafio.model.CharacterSchema;
import com.rickmorty.rmdesafio.model.LocationSchema;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class RickMortyServiceTest {

    RickMortyService rickMortyService = Mockito.mock(RickMortyService.class);

    @Test
    public void buildingSchemaTest(){
        rickMortyService.buildingSchema(new CharacterSchema(),new LocationSchema());
    }
}
