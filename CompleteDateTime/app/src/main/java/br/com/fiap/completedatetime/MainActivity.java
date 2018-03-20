package br.com.fiap.completedatetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actPaises;
    DatePicker dtpNasc;
    TimePicker tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] paises = {
                "Argentina",
                "Brasil",
                "Chile",
                "Dinamarca",
                "Escócia",
                "França",
                "Gana",
                "Haiti",
                "Índia",
                "Jamaica",
                "Kwait",
                "Lituania",
                "Marrocos",
                "Nicaraguá",
                "Omã",
                "Polônia",
                "Quenia",
                "Romenia",
                "Suiça"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                            this,
                            android.R.layout.simple_list_item_1,
                            paises);

        actPaises = findViewById(R.id.actPaises);
        actPaises.setAdapter(adapter);

        dtpNasc = findViewById(R.id.dtpNasc);
        tmp = findViewById(R.id.tmp);
    }

    public void salvar(View view) {
        int dia = dtpNasc.getDayOfMonth();
        int mes = dtpNasc.getMonth() + 1;
        int ano = dtpNasc.getYear();
        int hora = tmp.getCurrentHour();
        int minutos = tmp.getCurrentMinute();

        Toast.makeText(this, String.format("%s | %d/%d/%d | %d:%d", actPaises.getText(),dia, mes, ano, hora, minutos), Toast.LENGTH_SHORT).show();


    }
}
