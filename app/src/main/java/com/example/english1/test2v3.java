package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class test2v3 extends AppCompatActivity {

    EditText ER;
    String ca = "bathroom";
    int min = 0;
    int max = 3;
    int diff = max - min;
    Random random = new Random();
    int activity = random.nextInt(diff + 1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2v3);
        final Bundle key = getIntent().getExtras();
        ER = findViewById(R.id.er2v3);
        final String response = ER.getText().toString();

        if(activity == 0){
            activity = activity + 1;
        }

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.btn2v3);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int points = key.getInt("points1");
                if(response.equals(ca)){
                    points = points+1;
                }else{
                    points = points+0;
                }
                if(activity == 1){
                    Intent intent = new Intent(getApplicationContext(), test3.class);
                    intent.putExtra("points2", points);
                    startActivity(intent);
                }else if (activity == 2){
                    Intent intent = new Intent(getApplicationContext(), test3v2.class);
                    intent.putExtra("points1", points);
                    startActivity(intent);
                }else if (activity == 3){
                    Intent intent = new Intent(getApplicationContext(), test3v3.class);
                    intent.putExtra("points1", points);
                    startActivity(intent);
                }
            }
        });
    }
}