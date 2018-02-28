package br.com.fiap.helloworld;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Retorna um objeto do tipo view
        //Casting -->  edtNome =(EditText) findViewById(R.id.edtNome);
        edtNome = findViewById(R.id.edtNome);
    }

    public void salvar(View view){
        //Pegando o texto do componente
        String nome = edtNome.getText().toString();

        //Mostrando o nome com Toast
        //Toast.makeText(this, "O nome informado é " + nome, Toast.LENGTH_SHORT).show();

        //Mostrando a mensagem com Alert
        AlertDialog.Builder alert = new AlertDialog.Builder( this);

        alert.setTitle(R.string.titulo_alert); //Internationalization do Java
        alert.setMessage(R.string.message);
        alert.setPositiveButton(R.string.ok,null);
        alert.show();
    }
}
