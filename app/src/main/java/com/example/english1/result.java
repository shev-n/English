package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class result extends AppCompatActivity {

    int min = 0;
    int max = 3;
    int diff = max - min;
    Random random = new Random();
    int activity = random.nextInt(diff + 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle key = getIntent().getExtras();
        int points = key.getInt("points3");
        TextView res = findViewById(R.id.pointres);
        Button replay = (Button) findViewById(R.id.replay);
        ImageView line1 = (ImageView) findViewById(R.id.liniyare1);
        ImageView line2 = (ImageView) findViewById(R.id.liniyare2);
        if(activity == 0){
            activity = activity + 1;
        }

        if(points==3){
            res.setText("100% - Great!");
        }else if(points==2){
            res.setText("66% - Well!");
        }else if(points==1){
            res.setText("33% - Badly!");
            replay.setVisibility(View.VISIBLE);
            line1.setVisibility(View.VISIBLE);
            line2.setVisibility(View.VISIBLE);
        }else if(points==0){
            res.setText("0% - Very Bad!");
            replay.setVisibility(View.VISIBLE);
            line1.setVisibility(View.VISIBLE);
            line2.setVisibility(View.VISIBLE);
        }

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.bmenu);
        @SuppressLint("WrongViewCast") Button b2 = findViewById(R.id.replay);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(activity == 1){
                    Intent intent = new Intent(getApplicationContext(), test1.class);
                    startActivity(intent);
                }else if (activity == 2){
                    Intent intent = new Intent(getApplicationContext(), test1v2.class);
                    startActivity(intent);
                }else if (activity == 3){
                    Intent intent = new Intent(getApplicationContext(), test1v3.class);
                    startActivity(intent);
                }
            }
        });

    }
}