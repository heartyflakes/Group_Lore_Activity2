package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);

        Button sandwich = findViewById(R.id.btn1);
        Button banana = findViewById(R.id.btn2);
        TextView desc = findViewById(R.id.txtdesc);

        sandwich.setOnClickListener(this);
        banana.setOnClickListener(this);

        desc.setText("You wake up one morning for another school day, " +
                "you bathed, dressed and just about to eat breakfast before heading off. " +
                "In a rush, you looked in the fridge and checked your options: " +
                "a week-old sandwich or a single banana. Which one will you eat?");
    }
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn1){
            Intent y = new Intent (page_1.this,page_2.class);
            startActivity(y);
        }
        else if(view.getId() ==R.id.btn2){
            Intent f = new Intent(page_1.this,page_3.class);
            startActivity(f);
        }

    }
}