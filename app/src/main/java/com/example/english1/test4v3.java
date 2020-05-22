package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class test4v3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4v3);
        final Bundle key = getIntent().getExtras();


        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.b1t4v3);
        @SuppressLint("WrongViewCast") Button b2 = findViewById(R.id.b2t4v3);
        @SuppressLint("WrongViewCast") Button b3 = findViewById(R.id.b3t4v3);
        @SuppressLint("WrongViewCast") Button b4 = findViewById(R.id.b4t4v3);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int points = key.getInt("points3");
                points=points+1;
                Intent intent = new Intent(getApplicationContext(), result.class);
                intent.putExtra("points4", points);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int points = key.getInt("points3");
                Intent intent = new Intent(getApplicationContext(), result.class);
                intent.putExtra("points4", points);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int points = key.getInt("points3");
                Intent intent = new Intent(getApplicationContext(), result.class);
                intent.putExtra("points4", points);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int points = key.getInt("points3");
                Intent intent = new Intent(getApplicationContext(), result.class);
                intent.putExtra("points4", points);
                startActivity(intent);
            }
        });

    }
}