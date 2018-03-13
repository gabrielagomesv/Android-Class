package fiap.com.br.nac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox check;
    RadioGroup opcoes;
    EditText respMetros;
    TextView resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check = findViewById(R.id.check);
        opcoes = findViewById(R.id.opcoes);
        respMetros = findViewById(R.id.respMetros);
        resultadoFinal = findViewById(R.id.resultadoFinal);
    }

    public void calcular(View view) {
        String msg = "";
        double precoPorMetro = 0;
        double valorComFrete = 0;
        double resposta = Double.parseDouble(respMetros.getText().toString());

        int idOpcao = opcoes.getCheckedRadioButtonId();
        switch (idOpcao){
            case R.id.opcao1:
                precoPorMetro = 24.90 * resposta;
                msg = "R$" + precoPorMetro;
                resultadoFinal.setText(String.valueOf(msg));
                break;

            case R.id.opcao2:
                precoPorMetro = 11.90 * resposta;
                msg = "R$" + precoPorMetro;
                resultadoFinal.setText(String.valueOf(msg));
                break;

            case R.id.opcao3:
                precoPorMetro = 39.90 * resposta;
                msg = "R$" + precoPorMetro;
                resultadoFinal.setText(String.valueOf(msg));
                break;

            case R.id.opcao4:
                precoPorMetro = 16.90 * resposta;
                msg = "R$" + precoPorMetro;
                resultadoFinal.setText(String.valueOf(msg));
                break;

            default:
                msg = getString(R.string.invalido);
                resultadoFinal.setText(String.valueOf(msg));

        }

        if (check.isChecked()){
            valorComFrete =  precoPorMetro * 1.3;
            msg = "O valor com frete será de R$" + valorComFrete;
            resultadoFinal.setText(String.valueOf(msg));
        }


    }
}
