package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class test2 extends AppCompatActivity implements View.OnClickListener {

    EditText er2;

    DBHelper2 dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        dbHelper = new DBHelper2(this);


        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), test3.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {

        String er = er2.getText().toString();

        SQLiteDatabase database = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        switch (v.getId()) {

            case R.id.btn2:
                contentValues.put(DBHelper2.KEY_CA, er);

                database.insert(DBHelper2.TABLE_CONTACTS, null, contentValues);
                break;
        }
        dbHelper.close();
    }
    }

