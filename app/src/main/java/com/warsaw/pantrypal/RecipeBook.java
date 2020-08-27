package com.warsaw.pantrypal;

import java.util.HashMap;
import java.util.Map;

public class RecipeBook {
    private Map<String, Recipe> recipeBook = new HashMap<String, Recipe>();

    public RecipeBook(Map<String, Recipe> recipeBook){
        this.recipeBook = recipeBook;
    }

    public Map<String, Recipe> getRecipeBook() {
        return recipeBook;
    }

    public void setRecipeBook(Map<String, Recipe> recipeBook) {
        this.recipeBook = recipeBook;
    }

    public void addRecipe(Recipe newRecipe){
        recipeBook.put(newRecipe.name, newRecipe);
        //sort(recipeBook);
    }
    /*
    private void sort(Map<String, Recipe> recipeBook){

    }*/
}
