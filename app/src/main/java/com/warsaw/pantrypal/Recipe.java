package com.warsaw.pantrypal;

import java.util.HashMap;
import java.util.Map;

public class Recipe {
    public String name;
    public String[] instructions = new String[50];
    public Map<String, Food> ingredients = new HashMap<String, Food>();
    public float time;
    private int numSteps;
    public String comments; //maybe make comments and notes a list of strings
    public String notes;

    public Recipe(String name, String[] instructions, Map<String, Food> ingredients, float time, int numSteps, String comments, String notes){
        this.name = name;
        this.instructions = instructions;
        this.ingredients = ingredients;
        this.time = time;
        this.numSteps = numSteps;
        this.comments = comments;
        this.notes = notes;
    }

    public void addInstruction(String newInstruction){
        numSteps++;
        instructions[numSteps] = newInstruction;
    }

    public void addIngredient (Food newIngredient){
        ingredients.put(newIngredient.name, newIngredient);
    }

    public void setName(String newName){
        name = newName;
    }

    public void setInstructions(String[] instructions, int numSteps) {
        this.instructions = instructions;
        this.numSteps = numSteps;
    }

    public void setIngredients(Map<String, Food> ingredients) {
        this.ingredients = ingredients;
    }

    public void setTime(int newTime){
        time = newTime;
    }

    public void setComments(String newComments){
        comments = newComments;
    }

    public void setNotes(String newNotes){
        notes = newNotes;
    }

    public String getName(){
        return name;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public Map<String, Food> getIngredients() {
        return ingredients;
    }

    public float getTime() {
        return time;
    }

    public String getComments() {
        return comments;
    }

    public String getNotes() {
        return notes;
    }
}
