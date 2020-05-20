package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;
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


public class test1v3 extends AppCompatActivity {

    String ca = "";
    String response = "";
    int points = 0;

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.yes1v3);
        @SuppressLint("WrongViewCast") Button b2 = findViewById(R.id.no1v3);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    points = points+1;
                Intent intent = new Intent(getApplicationContext(), test2.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), test2.class);
                startActivity(intent);
            }
        });

    }
}