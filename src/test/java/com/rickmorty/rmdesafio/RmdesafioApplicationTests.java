package com.rickmorty.rmdesafio;

import com.rickmorty.rmdesafio.controller.dto.RootObjectSchema;
import com.rickmorty.rmdesafio.service.RickMortyService;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RmdesafioApplicationTests {

    @Test
    public void contextLoads() {

        RickMortyService rickMortyService = new RickMortyService();

        RootObjectSchema resp = rickMortyService.rickMortyService(1);
        JSONObject jsonObject = new JSONObject(resp);

        JSONObject jsonSchema = new JSONObject(
                new JSONTokener(RmdesafioApplicationTests.class.getResourceAsStream("/schema.json")));

        Schema schema = SchemaLoader.load(jsonSchema);
        schema.validate(jsonObject);
    }
}
