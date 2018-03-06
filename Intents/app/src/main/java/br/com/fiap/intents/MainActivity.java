package br.com.fiap.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirOpcional1(View view) {
        //A partir desta activity, abre as outras
        Intent it = new Intent(this, Opcional1Activity.class);
        startActivity(it);
    }

    public void abrirOpcional2(View view) {
        Intent it = new Intent(this, Opcional2Activity.class);
        startActivity(it);
    }
}
