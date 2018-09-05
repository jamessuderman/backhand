package com.sudee.onhand.services;

import com.sudee.onhand.models.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class RecipeService {
    private List<Recipe> recipes = new ArrayList<>();

    private void initRecipes() {
        recipes.add(new Recipe("Lasagna", "Italian", 4));
        recipes.add(new Recipe("Quesadilla", "Mexican", 5));
        recipes.add(new Recipe("Hamburger", "American", 5));
        recipes.add(new Recipe("Orange Chicken", "Chinese", 4));
        recipes.add(new Recipe("Crepes", "French", 3));
        recipes.add(new Recipe("Sushi", "Japanese", 5));
        recipes.add(new Recipe("Pho", "Vietnamese", 4));
    }

    public Collection<Recipe> getRecipes() {
        if(recipes.isEmpty()) {
            initRecipes();
        }
        return recipes;
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

}
