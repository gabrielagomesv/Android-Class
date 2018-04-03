package br.com.fiap.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm on 03/04/2018.
 */

public class ContatosAdapter extends BaseAdapter {

    private Context context;
    private List<Contato> contatos;

    //Construtor
    public ContatosAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }


    @Override
    public int getCount() {
        return contatos.size();
    }

    @Override
    public Object getItem(int position) {
        return contatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Contato contato = (Contato) getItem(position);

        View v = layoutInflater.inflate(R.layout.list_contatos, null);
        ImageView imgContato = (ImageView) v.findViewById(R.id.imgContato);
        TextView txtNome = (TextView) v.findViewById(R.id.textNome);
        TextView textContato = (TextView) v.findViewById(R.id.telefone);

        imgContato.setImageResource(contato.getImagem());
        txtNome.setText(contato.getNome());
        textContato.setText(  String.valueOf(contato.getContato() ));

        return v;
    }
}
