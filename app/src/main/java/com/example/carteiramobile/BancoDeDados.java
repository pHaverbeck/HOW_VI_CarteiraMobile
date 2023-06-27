package com.example.carteiramobile;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BancoDeDados extends SQLiteOpenHelper {
    public BancoDeDados(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.getWritableDatabase().execSQL("create table if not exists listaUsuarios (id INTEGER primary key autoincrement, usuario String)");

    }

    public void criarUsuario(String usuario){
        Object[] valores = {usuario};
        this.getWritableDatabase().execSQL("insert into listaUsuarios (usuario) values(?)",valores);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
