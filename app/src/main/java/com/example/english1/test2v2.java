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

public class test2v2 extends AppCompatActivity {

    EditText ER;
    DBHelper dbHelper;
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2v2);
        ER = findViewById(R.id.er2v2);
        final String response = ER.getText().toString();
        dbHelper = new DBHelper(this);
        ContentValues contentValues = new ContentValues();

        contentValues.put(DBHelper.KEY_QUESTION, "_NG_N_ER");
        contentValues.put(DBHelper.KEY_CA, "engineer");

        @SuppressLint("WrongViewCast") Button b1 = findViewById(R.id.btn2v2);
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