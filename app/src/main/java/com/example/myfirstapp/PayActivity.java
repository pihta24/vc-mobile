package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }
    
    public void onBackClick(View view){
        onBackPressed();

    }

    public void onPayClick(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.avito.ru/moskva/druggle_zhivotnye?q=купить+корову";
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}