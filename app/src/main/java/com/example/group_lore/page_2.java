package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);

        Button back = findViewById(R.id.btnback);

        back.setOnClickListener(this);

        TextView desc = findViewById(R.id.txtview);

        desc.setText("Your stomach feels very queasy right after eating that sandwich, " +
                "just what was in that thing? You felt very sick and ended up not going to school." +
                " (End, return to start)");
    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.btnback) {
            //super.onBackPressed();
            Intent g = new Intent(page_2.this,MainActivity.class);
            startActivity(g);
        }
    }
}