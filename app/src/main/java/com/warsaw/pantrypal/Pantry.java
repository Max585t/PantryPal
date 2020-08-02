package com.warsaw.pantrypal;

import java.util.HashMap;
import java.util.Map;

public class Pantry {
    private Map<String, Food> pantry;

    public Pantry(){
        this.pantry = new HashMap<String, Food>();
    }

    public void addFood(Food newFood){
        pantry.put(newFood.getName(), newFood);
    }

    public Food getFood(String foodName){
        return pantry.get(foodName);
    }
}
