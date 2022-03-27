package com.rickmorty.rmdesafio.controller;


import com.rickmorty.rmdesafio.controller.dto.RootObjectSchema;
import com.rickmorty.rmdesafio.service.RickMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRickMorty {

    @Autowired
    private RickMortyService rickMortyService;

    @RequestMapping("/api/{id}")
    public RootObjectSchema rickMortyapi(@PathVariable("id") int id) {
        return rickMortyService.rickMortyService(id);
    }
}
