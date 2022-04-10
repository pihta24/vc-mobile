package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {


    TextView name;
    TextView adress;
    TextView time;
    ImageView shop_photo;
    Button decline;
    Button accept;
    Integer counter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.textView3);
        adress = findViewById(R.id.textView4);
        time = findViewById(R.id.textView5);
        shop_photo = findViewById(R.id.imageView3);
        decline = findViewById(R.id.button1);
        accept = findViewById(R.id.button);
        decline.setOnClickListener(this::onClick);
        accept.setOnClickListener(this::onClick);
        counter = 0;

    }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button:  // принять
                Intent intent = new Intent(MainActivity.this, CardActivity.class);
                startActivity(intent);
                break;
            case R.id.button1:  // отклонить
                switch (counter){
                    case 0:
                        shop_photo.setImageResource(R.drawable.shop_3);
                        name.setText("   Магазин Перекрёсток");
                        adress.setText("   ул. Советов, 28, корп. 3, Челябинск");
                        time.setText("   9:10 - 9:30 ");
                        counter += 1;
                        break;
                    case 1:
                        shop_photo.setImageResource(R.drawable.shop_2);
                        name.setText("   Магазин БИЛЛА");
                        adress.setText("   ул. Молостовых, 13, корп. 1, Москва");
                        time.setText("   15:20 - 16:30 ");
                        counter += 1;
                        break;
                    case 2:
                        shop_photo.setImageResource(R.drawable.shop_4);
                        name.setText("   Магазин Лента");
                        adress.setText("   ул. Пушкина, д. Колотушкина, Караганда");
                        time.setText("   10:10 - 11:30 ");
                        counter += 1;
                        break;
                    case 3:
                        shop_photo.setImageResource(R.drawable.shop_1);
                        name.setText("   Магазин Пятёроччка");
                        adress.setText("   ул. Молостовых, 9, корп. 1, Москва");
                        time.setText("   8:30 - 8:50 ");
                        counter = 0;
                        break;
                }


                //Intent intent2 = new Intent(MainActivity.this, RegistrationActivity.class);
                //startActivity(intent2);
                break;

        }
    }
}