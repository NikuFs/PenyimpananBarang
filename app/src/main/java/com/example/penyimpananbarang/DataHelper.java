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
//        String sql = "create table user(iduser integer primary key, username text, password text);";
//        Log.d("Data", "onCreate: " + sql);
//        data.execSQL("create table user(iduser integer primary key, username text, password text)");
//        data.execSQL("create table stock (idstock integer primary key, namabarang text, stockbarang text)");
//        data.execSQL("insert into user (iduser, username, password) values (1, 'admin', 'admin')");

        data.execSQL(Table1.USER_TABLE);
        data.execSQL(Table2.STOCK_TABLE);




        //insert data user
//        sql = "insert into user (iduser, username, password) values (1, 'admin', 'admin');";
//        data.execSQL(sql);

//        sql = "create table stock(idstock integer primary key, namabarang text, stockbarang text);";
//        Log.d("Data", "onCreate: " + sql);

        //insert data stock
//        sql = "insert into stock (idstock, namabarang, stockbarang) values (1, 'teh', 10);";
//        data.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase data, int i, int i1) {

    }

    public class Table1{
        public static final String User = "user";
        public static final String IDUser = "iduser";
        public static final String Username = "username";
        public static final String Password = "password";

        private static final String USER_TABLE =
                "CREATE TABLE " + User + "(" +
                        IDUser + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        Username + " TEXT," +
                        Username + " TEXT" +
                        // Add more column definitions if needed
                        ")";
    }

    public class Table2{
        public static final String Stock = "stock";
        public static final String IDStock = "idstock";
        public static final String NamaBarang = "namabarang";
        public static final String StockBarang = "stockbarang";

        public static final String STOCK_TABLE =
                "CREATE TABLE " + Stock + "(" +
                        IDStock + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        NamaBarang + " TEXT," +
                        StockBarang + " INTEGER" +
                        // Add more column definitions if needed
                        ")";
    }
}
