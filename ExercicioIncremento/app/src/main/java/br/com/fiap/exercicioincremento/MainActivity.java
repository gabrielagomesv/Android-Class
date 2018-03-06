package br.com.fiap.exercicioincremento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int contador = 0;
    TextView valor; //referencia ao elemento da layout que você quer utilizar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = findViewById(R.id.valor);

    }

    public void decrementa(View view) {
        if (contador > 0 && contador < 10){
            contador --;
            valor.setText(String.valueOf(contador));
        }else {
            Toast.makeText(this, R.string.validacao, Toast.LENGTH_SHORT).show();
        }

    }

    public void incrementa(View view) {
        if (contador < 10){
            contador ++;
            valor.setText(String.valueOf(contador));
        }else {
            Toast.makeText(this, R.string.validacao, Toast.LENGTH_SHORT).show();
        }
    }
}
