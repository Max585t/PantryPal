package com.warsaw.pantrypal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecipePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);

        Intent intent = getIntent();
    }

    public void saveRecipe(View view){
        Recipe recipe = new Recipe();

        TextView name = findViewById(R.id.TxtName);
        TextView time = findViewById(R.id.TxtTime);
        TextView comments = findViewById(R.id.TxtComments);
        TextView notes = findViewById(R.id.TxtNotes);

        float tempTime = Float.valueOf(time.getText().toString());

        recipe.setName(name.getText().toString());
        recipe.setTime(tempTime);
        recipe.setNotes(notes.getText().toString());
        recipe.setComments(comments.getText().toString());


    }

    public void clearRecipe(){

    }
}
