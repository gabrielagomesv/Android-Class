package br.com.fiap.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listContacts;
    List<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listContacts = (ListView) findViewById(R.id.listContacts);
        contatos = GeraListasContatos.geraContatos();

        ContatosAdapter adapter = new ContatosAdapter(this, contatos);
        listContacts.setAdapter(adapter);

    }
}
