package com.example.penyimpananbarang;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "penyimpananbarang.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase data) {
        // buat Tabel
        // TODO Auto-generated method stub
        String sql = "create table user(iduser integer primary key, username text, password text);";
        Log.d("Data", "onCreate: " + sql);
        data.execSQL(sql);

        //insert data
        sql = "insert into user (iduser, username, password) values (1, 'admin', 'admin');";
        data.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
