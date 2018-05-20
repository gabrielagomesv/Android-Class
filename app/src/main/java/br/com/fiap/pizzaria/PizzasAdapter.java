package br.com.fiap.pizzaria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gabrielagv on 20/05/2018.
 */

public class PizzasAdapter extends BaseAdapter {

    Context context;
    List<Pizza> pizzas;

    public PizzasAdapter(Context context, List<Pizza> pizzas) {
        this.context = context;
        this.pizzas = pizzas;
    }

    @Override
    public int getCount() {
        return this.pizzas.size();
    }

    @Override
    public Object getItem(int i) {
        return (Object)this.pizzas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Pizza pizza = this.pizzas.get(i);

        View v = layoutInflater.inflate(R.layout.activity_pizza_list, null);
        ImageView imgPizza = (ImageView) v.findViewById(R.id.imgPizza);
        TextView saborPizza = (TextView) v.findViewById(R.id.saborPizza);
        TextView ingredientesPizza = (TextView) v.findViewById(R.id.ingredientesPizza);
        TextView precoPizza = (TextView) v.findViewById(R.id.precoPizza);

        imgPizza.setImageResource(pizza.getImagem());
        saborPizza.setText(pizza.getSabor());
        ingredientesPizza.setText(pizza.getIngredientes());
        precoPizza.setText(pizza.getPreco());

        return v;
    }
}
