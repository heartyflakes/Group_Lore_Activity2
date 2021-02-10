package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3);

        Button pet = findViewById(R.id.pet);
        Button ignore = findViewById(R.id.gotoschool);
        TextView desc = findViewById(R.id.txtvieww);

        desc.setText("You ate it quick and left the house. As you walked out your gate, " +
                "a black cat is sitting right outside, seemingly waiting for you. " +
                "Will you pet it? Or ignore and go to school?");

        pet.setOnClickListener(this);
        ignore.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.pet) {
            Intent a = new Intent(page_3.this,page_4.class);
            startActivity(a);
        }
        else if (view.getId() == R.id.gotoschool) {
            Intent d = new Intent(page_3.this,page_7.class);
            startActivity(d);
        }




    }
}