package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4);

        TextView desc = findViewById(R.id.textView2);
        Button thank = findViewById(R.id.thank);
        Button classroom = findViewById(R.id.classroom);

        thank.setOnClickListener(this);
        classroom.setOnClickListener(this);

        desc.setText("The cat purrs happily, it follows you to school. " +
                "You arrived safely before the bell rang. " +
                "The cat is waiting for you to do something but " +
                "you’re still outside school and might get late. " +
                "Thank the cat with food? Or go to your classroom immediately?");
    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.thank) {
            Intent b = new Intent(page_4.this,page_5.class);
            startActivity(b);
        }
        if (view.getId() == R.id.classroom) {
            Intent c = new Intent(page_4.this,page_6.class);
            startActivity(c);
        }



    }
}