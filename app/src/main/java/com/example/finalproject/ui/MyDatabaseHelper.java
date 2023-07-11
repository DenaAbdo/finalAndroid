package com.example.finalproject.ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private Context contex;
    public static final String DATABASE_NAME ="db";
    public static final int DATABASE_VERSION =1;

    public static final String TABLE_NAME="my_library";
    public static final String COLUMN_ID="id";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_EMAIL="email";
    public static final int COLUMN_AGE=1;



    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.contex = context;    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "
                        + COLUMN_NAME + " TEXT, " +
                        COLUMN_EMAIL + " TEXT, " + "COLUMN_AGE" + COLUMN_AGE ;
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String query =
                "SELECT * FROM " + TABLE_NAME ;
        db.execSQL(query);
    }
}
