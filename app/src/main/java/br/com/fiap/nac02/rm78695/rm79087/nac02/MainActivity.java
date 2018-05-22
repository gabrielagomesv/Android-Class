package br.com.fiap.nac02.rm78695.rm79087.nac02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox select1;
    CheckBox select2;
    CheckBox select3;
    TextView resultadoFinal;
    int contador = 0;
    String msg = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        select1 = findViewById(R.id.select1);
        select2 = findViewById(R.id.select2);
        select3 = findViewById(R.id.select3);
        resultadoFinal = findViewById(R.id.resultadoFinal);
    }


    public void verMais1(View view) {
        Intent intent1 = new Intent(this, Burguer1Activity.class);
        startActivity(intent1);
    }

    public void verMais2(View view) {
        Intent intent2 = new Intent(this, Burguer2Activity.class);
        startActivity(intent2);
    }

    public void verMais3(View view) {
        Intent intent3 = new Intent(this, Burguer3Activity.class);
        startActivity(intent3);
    }


    public void comprar(View view) {
        if(select1.isChecked()) {
            contador += 30.00;
        }
        if(select2.isChecked()) {
            contador += 32.00;
        }
        if(select3.isChecked()) {
            contador += 45.00;
        }

        msg = "O valor total da sua compra é de R$ " + contador;
        resultadoFinal.setText(String.valueOf(msg));

    }
}
