package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_5 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5);

        TextView desc = findViewById(R.id.textView3);
        Button back = findViewById(R.id.back_to_start);

        back.setOnClickListener(this);

        desc.setText("The cat seems to bow down to you with respect. " +
                "You arrived in class on time and passed all your tests and quizzes that day. " +
                "(End)");

    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.back_to_start) {
            Intent c = new Intent(page_5.this,MainActivity.class);
            startActivity(c);
        }

    }
}