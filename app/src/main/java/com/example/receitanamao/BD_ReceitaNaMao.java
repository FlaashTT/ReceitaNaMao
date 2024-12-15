package com.example.receitanamao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BD_ReceitaNaMao extends SQLiteOpenHelper {
    // Nome e versão do banco de dados
    private static final String DATABASE_NAME = "receitaNaMao.db";
    private static final int DATABASE_VERSION = 1;

    public BD_ReceitaNaMao(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Criar tabelas
        //db.execSQL(CREATE_POSTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Atualizar o banco de dados se necessário
        //db.execSQL("DROP TABLE IF EXISTS " + TABLE_POSTS);
        onCreate(db);
    }
}
