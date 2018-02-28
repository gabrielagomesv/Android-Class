package br.com.fiap.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Objeto
    Spinner spnOpcoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnOpcoes = findViewById(R.id.spnOpcoes);

        String[] opcoes = new String[]{"AC","SP","AM","PI"};

        //Converte(interpreta) dados do array em opções do spinner
        //Primeiro modo
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this,
//                R.layout.support_simple_spinner_dropdown_item,
//                opcoes);

        //Segundo modo

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                opcoes);
        spnOpcoes.setAdapter(adapter);
    }


    public void salvar(View view) {
        String opcao = spnOpcoes.getSelectedItem().toString();
        Toast.makeText(this, opcao, Toast.LENGTH_SHORT).show();
    }
}
