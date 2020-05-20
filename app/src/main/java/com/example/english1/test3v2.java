package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class test3v2 extends AppCompatActivity {

    String response = "";
    int points;
    DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3v2);

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.hipp1);
        @SuppressLint("WrongViewCast") Button b2 = findViewById(R.id.crocodile1);
        @SuppressLint("WrongViewCast") Button b3 = findViewById(R.id.elephant1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), result.class);

                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), result.class);

                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                points=points+1;

                Intent intent = new Intent(getApplicationContext(), result.class);

                startActivity(intent);
            }
        });

    }
}