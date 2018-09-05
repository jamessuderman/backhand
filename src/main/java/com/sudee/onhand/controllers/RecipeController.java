package com.sudee.onhand.controllers;

import com.sudee.onhand.models.Recipe;
import com.sudee.onhand.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class RecipeController {
    @Autowired
    private final RecipeService recipeService = new RecipeService();

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/recipes")
    public Collection<Recipe> recipes() {
        return recipeService.getRecipes();
    }

}
