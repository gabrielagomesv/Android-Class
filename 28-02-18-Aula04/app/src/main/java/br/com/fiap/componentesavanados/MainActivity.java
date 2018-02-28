package br.com.fiap.componentesavanados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Classes
    CheckBox checkEstouAprendendo;
    RadioGroup rdgOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperando os elementos por ID
        checkEstouAprendendo = findViewById(R.id.checkEstouAprendendo);
        rdgOpcoes = findViewById(R.id.rdgOpcoes);
    }

    public void mostraDados(View view) {
        //Messagem do Toast
        // Ao invés de mostrar o id da opção, mostra a String
        int idRdg = rdgOpcoes.getCheckedRadioButtonId();
        String msg = "";

        switch (idRdg) {
            case R.id.rbdOpcao1:
                msg = getString(R.string.op_o_1);
                break;
            case R.id.rbdOpcao2:
                msg = getString(R.string.op_o_2);
                break;
            case R.id.rbdOpcao3:
                msg = getString(R.string.op_o_3);
                break;
            default:
                msg = getString(R.string.nenhuma_opcao);

        }



        //Balão de alert
        Toast.makeText(this,
                "Radio button selecionado: " + msg,
                Toast.LENGTH_SHORT).show();

        Toast.makeText(this,
                "Check box selecionado " + checkEstouAprendendo.isChecked(),
                Toast.LENGTH_LONG).show();

    }
}
