package br.com.fiap.actionbaremenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Objeto toolbar
        Toolbar toolbar = findViewById(R.id.tlbMain);
        toolbar.setSubtitle("Hello hello");
        toolbar.setLogo(R.mipmap.ic_launcher_round);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    //Usar o menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflar = ler o XML e transformar em objeto java
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Verifica o ID do item selecionado
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuSair){
            finish();
        }else if(item.getItemId() == R.id.menuSobre){
            Toast.makeText(this, R.string.sobreClicado, Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == android.R.id.home){
            Toast.makeText(this, R.string.voltou, Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
