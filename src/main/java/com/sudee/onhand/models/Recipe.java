package com.sudee.onhand.models;

import lombok.Data;

import java.util.*;

@Data
public class Recipe {

    private UUID id = UUID.randomUUID();
    private String name;
    private String cuisine;
    private int stars;

    private Map<String, Number> ingredients = new HashMap<>();
    private List<String> directions = new ArrayList<>();

    public Recipe(String name, String cuisine, int stars) {
        this.name = name;
        this.cuisine = cuisine;
        this.stars = stars;
    }

}
