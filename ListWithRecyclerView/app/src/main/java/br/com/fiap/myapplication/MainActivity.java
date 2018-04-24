package br.com.fiap.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvContatos;
    List<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContatos = findViewById(R.id.rvContatos);
        rvContatos.setHasFixedSize(true);

        contatos = GeraContatos.geraContatos();

        ContatoAdapter adapter = new ContatoAdapter(this, contatos);
        rvContatos.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvContatos.setLayoutManager(layoutManager);
    }
}
