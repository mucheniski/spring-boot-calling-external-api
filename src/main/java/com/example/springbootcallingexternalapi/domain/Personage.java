package com.example.springbootcallingexternalapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Personage {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("status")
    private String status;

    @JsonProperty("species")
    private String species;

    @JsonProperty("type")
    private String type;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("origin")
    private Origin origin;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("image")
    private String image;

    @JsonProperty("episode")
    private List<String> episode;

    @JsonProperty("url")
    private String url;

    @JsonProperty("created")
    private String created;

}
