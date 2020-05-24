package com.example.english1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class voc extends AppCompatActivity implements View.OnClickListener {
    DBvoc dBhelper;
    public String russianWord = "Компьютер";
    public String englishWord = "Computer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voc);
        dBhelper = new DBvoc(this);
    }

    @Override
    public void onClick(View v) {
        //добавление данных
        SQLiteDatabase database = dBhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBvoc.KEY_RUSSIAN, russianWord);
        contentValues.put(DBvoc.KEY_ENGLISH, englishWord);
        database.insert(DBvoc.TABLE_CONSTANTS, null, contentValues);
        Cursor cursor = database.query(DBvoc.TABLE_CONSTANTS, null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            int idIndex = cursor.getColumnIndex(DBvoc.KEY_ID);
            int russianIndex = cursor.getColumnIndex(DBvoc.KEY_RUSSIAN);
            int englishIndex = cursor.getColumnIndex(DBvoc.KEY_ENGLISH);
            do{
                //куда выводить данные с таблицы, после добавим
            }
            while (cursor.moveToFirst());
        }else {
            cursor.close();//закрытие курсора после вывода
        }
        dBhelper.close();//закрытие базы после вывода
    }
}