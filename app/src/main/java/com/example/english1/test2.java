package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class test2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        EditText er = (EditText) findViewById(R.id.er2);
        DBHelper dbHelper = new DBHelper(this);

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), test3.class);
                startActivity(intent);
            }
        });
        dbHelper.close();
    }
}