package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.btn_start);

        start.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){

        Intent i = new Intent(MainActivity.this,page_1.class);
        startActivity(i);



    }
}