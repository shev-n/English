package com.example.english1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBvoc extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "test2";
    public static final String TABLE_NAME = "voc";

    public static final String KEY_ID = "_id";
    public static final String KEY_WORD = "WORD";
    public static final String KEY_TRANSLATE = "TRANSLATE";

    public DBvoc(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DBvoc(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + "voc" + "(" + KEY_ID
                + " integer primary key," + KEY_WORD + " text," + KEY_TRANSLATE + " text" + ")");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME);

        onCreate(db);

    }
}
