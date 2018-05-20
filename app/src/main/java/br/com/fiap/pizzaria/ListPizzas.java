package br.com.fiap.pizzaria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabrielagv on 20/05/2018.
 */

public class ListPizzas {

    public static List<Pizza> listaPizzas() {
        List<Pizza> pizzas = new ArrayList<>();

        Pizza pizza1 = new Pizza(
                "Muçarela",
                "R$35,00",
                "Queijo muçarela, tomate e azeitona",
                R.drawable.pizza
        );

        Pizza pizza2 = new Pizza(
                "Calabresa",
                "R$38,00",
                "Calabresa defumada, cebola, tomate e azeitona",
                R.drawable.pizza2
        );

        pizzas.add(pizza1);
        pizzas.add(pizza2);


        return pizzas;
    }
}
