package com.kp.cilacap;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    //nama database
    public static final String DATABASE_NAME = "Student.db";
    //nama table
    public static final String TABLE_NAME = "student_table";
    //versi database
    private static final int DATABASE_VERSION = 1;
    //table field
    public static final String COL_1 = "ID";
    public static final String COL_2 = "GAMBAR";
    public static final String COL_3 = "NAMA";
    public static final String COL_4 = "DETAIL";
    public static final String COL_5 = "LOKASI";

    //constructor
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    //create table pertamakali
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table student_table(id integer primary key autoincrement," +
                "gambar text, " +
                "nama text," +
                "detail text," +
                "lokasi text);");
    }

    //ketika database version diubah menjadi lebih tinggi
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }

    //ketika database version diubah menjadi lebih rendah
    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    //metode untuk tambah data
    public boolean insertData(String gambar, String nama, String detail, String lokasi) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,gambar);
        contentValues.put(COL_3,nama);
        contentValues.put(COL_4,detail);
        contentValues.put(COL_5,lokasi);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    //metode untuk mengambil data
    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from student_table", null);
        return res;
    }

    //metode untuk merubah data
    public boolean updateData(String id,String gambar,String nama,String detail, String lokasi) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,gambar);
        contentValues.put(COL_3,nama);
        contentValues.put(COL_4,detail);
        contentValues.put(COL_5,lokasi);
        db.update(TABLE_NAME,contentValues,"ID = ?",new String[] {id});
        return true;
    }

    //metode untuk menghapus data
    public int deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?", new String[] {id});
    }
}
