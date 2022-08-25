package com.example.springbootcallingexternalapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Location {

    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

}
