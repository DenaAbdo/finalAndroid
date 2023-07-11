package com.example.finalproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class roomRecycler extends SQLiteOpenHelper {
    private Context contex;
    public static final String DATABASE_NAME ="db";
    public static final int DATABASE_VERSION =1;

    public roomRecycler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.contex= context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public Cursor getAll(){
            SQLiteDatabase db = getReadableDatabase();
            String query = "SELECT * from Room";
            Cursor cursor = db.rawQuery(query, null);
            return cursor;
    }

}

