package com.example.springbootcallingexternalapi.controllers;

import com.example.springbootcallingexternalapi.domain.Personage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/tests")
public class ApiExternalController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/callhello")
    public String getHelloClient() {
        String url = "http://localhost:8080/tests/hello";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

    @GetMapping("rickandmorty")
    public Personage getPersonage() throws IOException {
        String url = "https://rickandmortyapi.com/api/character/2";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        ObjectMapper mapper = new ObjectMapper();
//        Personage personage = mapper.readValue(new File("C:\\ws-developer\\spring-java\\spring-boot-calling-external-api\\src\\main\\resources\\retorno.json"), Personage.class);
        Personage personage = mapper.readValue(response, Personage.class);

        return personage;
    }

    @GetMapping("rickandmorty2")
    public String getCharacter2() {
        String url = "https://rickandmortyapi.com/api/character/2";
        RestTemplate restTemplate = new RestTemplate();
        String character = restTemplate.getForObject(url, String.class);
        return character;
    }

}
