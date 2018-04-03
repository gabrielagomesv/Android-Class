package br.com.fiap.pesistenciasqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 03/04/2018.
 */

public class DataBase extends SQLiteOpenHelper {

    public static final String NOME_DB = "SqlContatos";
    public static final Integer VERSAO_BD = 1;
    public static final String TB_CONTATOS = "contatos";

    //Construtor
    public DataBase(Context context){
         super(context, NOME_DB, null, VERSAO_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+ TB_CONTATOS +"(" + "`id` INTEGER PRIMARY KEY AUTOINCREMENT," + " `nome` TEXT" + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insertContato(Contato contato){
        SQLiteDatabase db = getWritableDatabase();

        //Params
        ContentValues cv = new ContentValues();
        cv.put("nome", contato.getNome());

        db.insert(TB_CONTATOS, null, cv);

        return true;
    }

    public boolean updateContato(Contato contato){
        SQLiteDatabase db = getWritableDatabase();

        //Params
        ContentValues cv = new ContentValues();
        cv.put("nome", contato.getNome());
        cv.put("id", contato.getId());

        String id = String.valueOf(contato.getId());
        db.update(TB_CONTATOS, cv, "id = ?", new String[]{ id });

        return true;
    }

    public void deleteContato(int id){
        SQLiteDatabase db = getWritableDatabase();

        String idString = String.valueOf(id);
        db.delete(TB_CONTATOS,"id = ?", new String[]{ idString });
    }

    public List<Contato> listContatos(){
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.query(
                TB_CONTATOS,
                new String[]{ "id", "nome" },
                null,
                null,
                null,
                null,
                "nome",
                null
        );

        List<Contato> contatos = new ArrayList<>();

       while(cursor.moveToNext()){
           int id = cursor.getInt(0);
           String nome = cursor.getString(1);

           Contato contato = new Contato(id, nome);
           contatos.add(contato);
       }
        cursor.close();
        return contatos;
    }

}
