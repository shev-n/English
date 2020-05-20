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

public class test2v3 extends AppCompatActivity {

    EditText ER;
    DBHelper dbHelper;
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2v3);
        ER = findViewById(R.id.er2v3);
        final String response = ER.getText().toString();
        dbHelper = new DBHelper(this);
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBHelper.KEY_QUESTION, "BA_HR_OM");
        contentValues.put(DBHelper.KEY_CA, "bathroom");

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.btn2v3);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(response.equals(DBHelper.KEY_CA)){

                    points = points+1;

                }else{
                    points = points+0;
                }
                Intent intent = new Intent(getApplicationContext(), test3.class);
                startActivity(intent);
            }
        });
    }
}