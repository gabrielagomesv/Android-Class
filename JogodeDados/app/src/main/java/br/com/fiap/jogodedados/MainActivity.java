package br.com.fiap.jogodedados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] imgs = {
            R.drawable.dado1,
            R.drawable.dado2,
            R.drawable.dado3,
            R.drawable.dado4,
            R.drawable.dado5,
            R.drawable.dado6
    };

    ImageView imgDado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Chamando o objeto e guardando na variavel
        imgDado = findViewById(R.id.imgDado);
    }

    public void jogar(View view){
        //Instancia de um objeto do tipo Random
        Random random = new Random();

        //Pega o tamanho do length
        int sorteado = random.nextInt(imgs.length);

        //Passa um recurso de imagem
        imgDado.setImagemResource(imgs[sorteado]);
    }
}
