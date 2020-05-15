package com.example.english1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "test2";
    public static final String TABLE_NAME = "contacts";

    public static final String KEY_ID = "_id";
    public static final String KEY_QUESTION = "QUESTION";
    public static final String KEY_CA = "CA";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + "test1" + "(" + KEY_ID
                + " integer primary key," + KEY_QUESTION + " text," + KEY_CA + " text" + ")");
        db.execSQL("create table " + "test2" + "(" + KEY_ID
                + " integer primary key," + KEY_QUESTION + " text," + KEY_CA + " text" + ")");
        db.execSQL("create table " + "test3" + "(" + KEY_ID
                + " integer primary key," + KEY_QUESTION + " text," + KEY_CA + " text" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME);

        onCreate(db);

    }
}
