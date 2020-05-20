package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Dialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.play_btn);
        @SuppressLint("WrongViewCast") Button b2 = findViewById(R.id.voc_btn);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), test1.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), voc.class);
                startActivity(intent);
            }
        });

        //Подключение диалогового окна
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.acrivity_dialog);
        Button buttonDialog = (Button) dialog.findViewById(R.id.buttonDialog);
        buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(false);
        dialog.setTitle("Запомни!");
        dialog.show();

    }
}