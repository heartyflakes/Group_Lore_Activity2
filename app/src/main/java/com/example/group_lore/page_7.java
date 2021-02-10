package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_7 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_7);

        Button button = findViewById(R.id.button2);
        TextView view = findViewById(R.id.textView5);

        button.setOnClickListener(this);

        view.setText("The cat sits still, it glares at you before leaving. " +
                "You just shrug and run off to school. As you step into a crossroads," +
                " a truck zooms in your direction. You got run over. You died." +
                " (End, return to start)");

    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.button2) {
            Intent f = new Intent(page_7.this,MainActivity.class);
            startActivity(f);
        }

    }
}