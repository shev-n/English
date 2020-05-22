package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class test3v2 extends AppCompatActivity {

    int t3 = 0;
    int min = 0;
    int max = 3;
    int diff = max - min;
    Random random = new Random();
    int activity = random.nextInt(diff + 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3v2);
        final Bundle key = getIntent().getExtras();

        if(activity == 0){
            activity = activity + 1;
        }

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.hipp1);
        @SuppressLint("WrongViewCast") Button b2 = findViewById(R.id.crocodile1);
        @SuppressLint("WrongViewCast") Button b3 = findViewById(R.id.elephant1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int points = key.getInt("points2");
                int t1 = key.getInt("test1");
                int t2 = key.getInt("test2");
                if(activity == 1){
                    Intent intent = new Intent(getApplicationContext(), test4.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }else if (activity == 2){
                    Intent intent = new Intent(getApplicationContext(), test4v2.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }else if (activity == 3){
                    Intent intent = new Intent(getApplicationContext(), test4v3.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int points = key.getInt("points2");
                int t1 = key.getInt("test1");
                int t2 = key.getInt("test2");
                if(activity == 1){
                    Intent intent = new Intent(getApplicationContext(), test4.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }else if (activity == 2){
                    Intent intent = new Intent(getApplicationContext(), test4v2.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }else if (activity == 3){
                    Intent intent = new Intent(getApplicationContext(), test4v3.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int points = key.getInt("points2");
                int t1 = key.getInt("test1");
                int t2 = key.getInt("test2");
                points=points+1;
                t3 = t3+1;

                if(activity == 1){
                    Intent intent = new Intent(getApplicationContext(), test4.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }else if (activity == 2){
                    Intent intent = new Intent(getApplicationContext(), test4v2.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }else if (activity == 3){
                    Intent intent = new Intent(getApplicationContext(), test4v3.class);
                    intent.putExtra("points3", points);
                    intent.putExtra("test1", t1);
                    intent.putExtra("test2", t2);
                    intent.putExtra("test3", t3);
                    startActivity(intent);
                }
            }
        });

    }
}