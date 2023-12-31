package com.example.finalproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class roomRecycler extends SQLiteOpenHelper {
    private Context contex;
    public static final String DATABASE_NAME ="db";
    public static final int DATABASE_VERSION =1;
    private RecyclerView.LayoutManager layoutManager;


    public roomRecycler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.contex= context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE Room(ROOM TEXT PRIMARY KEY  NOT NULL, Area TEXT NOT NULL, num TEXT NOT NULL)");
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

    public void setAdapter(MyAdapter adapter) {
        setAdapter(adapter);
    }

    public void setLayoutManager(LinearLayoutManager linearLayoutManager) {
        this.layoutManager = layoutManager;
    }
}

