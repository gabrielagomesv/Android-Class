package br.com.fiap.listview;
//alt + enter importa
import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 03/04/2018.
 */

public class GeraListasContatos {

    public static List<Contato> geraContatos(){
        List<Contato> contatos = new ArrayList<Contato>();

        Contato contato1 = new Contato("Gabriela","Bla bla whiskas sachê",  R.drawable.p3 ,112456734 );
        Contato contato2 = new Contato("Maria", "Olar" , R.drawable.p2, 113434332);
        Contato contato3 = new Contato("João", "ble" , R.drawable.p1, 11343234);
        Contato contato4 = new Contato("Pedro", "laalala" , R.drawable.p4, 11334324);

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);

        return contatos;
    }
}
