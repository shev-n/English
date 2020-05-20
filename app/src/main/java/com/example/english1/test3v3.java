package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class test3v3 extends AppCompatActivity {

    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3v3);


        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.shark1);
        @SuppressLint("WrongViewCast") Button b2 = findViewById(R.id.wolf1);
        @SuppressLint("WrongViewCast") Button b3 = findViewById(R.id.cat1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                points=points+1;
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
                Intent intent = new Intent(getApplicationContext(), result.class);

                startActivity(intent);
            }
        });

    }
}