package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.ContentValues;
import android.widget.Button;


public class test1v2 extends AppCompatActivity {

    int points = 0;

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1v2);

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.yes1v2);
        @SuppressLint("WrongViewCast") Button b2 = findViewById(R.id.no1v2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), test2.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    points = points+1;
                Intent intent = new Intent(getApplicationContext(), test2.class);
                startActivity(intent);
            }
        });

    }
}