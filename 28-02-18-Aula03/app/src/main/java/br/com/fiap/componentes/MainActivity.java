package br.com.fiap.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Resgastado o elemento  da view para manipular
        //Classe R cria referencias
        imgAndroid = findViewById(R.id.imgAndroid);
    }

    public void alterarImagem(View view) {
        imgAndroid.setImageResource(R.drawable.android2);
    }
}
