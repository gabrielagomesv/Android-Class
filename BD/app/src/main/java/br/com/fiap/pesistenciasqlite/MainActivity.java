package br.com.fiap.pesistenciasqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    DataBase db;
    ListView lstContatos;
    List<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DataBase(this);
        lstContatos = findViewById(R.id.lstContatos);

    }

    @Override
    protected void onStart() {
        super.onStart();

        contatos = db.listContatos();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, contatos);
        lstContatos.setAdapter(adapter);
        
    }

    public void abrirCadastro(View view) {
        Intent it = new Intent(this, CadastroActivity.class);
        startActivity(it);
    }
}
