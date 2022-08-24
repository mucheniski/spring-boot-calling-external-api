package com.example.springbootcallingexternalapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    public Object getCharacter() {
        String url = "https://rickandmortyapi.com/api/character/2";
        RestTemplate restTemplate = new RestTemplate();
        Object character = restTemplate.getForObject(url, Object[].class);
        return character;
    }

}
