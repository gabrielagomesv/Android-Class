package br.com.fiap.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listPizzas;
    List<Pizza> pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzas = ListPizzas.listaPizzas();
        listPizzas = (ListView) findViewById(R.id.listPizzas);

        PizzasAdapter pizzasAdapter = new PizzasAdapter(this, pizzas);
        listPizzas.setAdapter(pizzasAdapter);

        final Intent intent = new Intent(this, ShowPizza.class);
        listPizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                intent.putExtra("posicao", i);
                startActivity(intent);
            }
        });
    }
}
