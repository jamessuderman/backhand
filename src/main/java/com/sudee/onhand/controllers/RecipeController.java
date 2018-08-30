/*
 *   GEODynamics
 *   Author - James Suderman
 *   Date - 08/10/2018
 */

package com.sudee.onhand.controllers;

import com.sudee.onhand.models.Recipe;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class RecipeController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/recipes")
    public Collection<Recipe> getRecipes() {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Lasagna", "Italian", 4));
        recipes.add(new Recipe("Quesadilla", "Mexican", 5));
        recipes.add(new Recipe("Hamburger", "American", 5));
        recipes.add(new Recipe("Orange Chicken", "Chinese", 4));
        recipes.add(new Recipe("Crepes", "French", 3));
        return recipes;
    }
}
