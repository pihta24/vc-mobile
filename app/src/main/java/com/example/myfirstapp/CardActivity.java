package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardActivity extends AppCompatActivity {
Button accept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        accept = findViewById(R.id.button);
        accept.setOnClickListener(this::onClick);
    }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button1:  // принять
                //Intent intent = new Intent(MainActivity.this, ActiveActivity.class);
                //startActivity(intent);
                break;
            case R.id.button:  // отклонить


                Intent intent2 = new Intent(CardActivity.this, MainActivity.class);
                startActivity(intent2);
                break;

        }
    }
}