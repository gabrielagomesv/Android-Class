package br.com.fiap.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 24/04/2018.
 */

public class GeraContatos {

    public static List<Contato> geraContatos(){
        List<Contato> contatos = new ArrayList<>();

        Contato contato = new Contato(
                "Gabriela Gomes",
                "11 985337848",
                "Ocupado",
                R.drawable.girl
        );

        Contato contato2 = new Contato(
                "Maria Silva",
                "11 985337848",
                "Trabalho",
                R.drawable.woman
        );


        Contato contato3 = new Contato(
                "João",
                "11 98432342348",
                "Disponível",
                R.drawable.boy
        );

        contatos.add(contato);
        contatos.add(contato2);
        contatos.add(contato3);

        return contatos;
    }
}
