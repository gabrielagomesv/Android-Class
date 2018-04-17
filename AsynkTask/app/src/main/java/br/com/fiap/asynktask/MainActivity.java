package br.com.fiap.asynktask;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText edtURL;
    ImageView imgBaixada;

    //Usando PD para otimizar tempo de requisicao
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtURL = findViewById(R.id.edtURL);
        imgBaixada = findViewById(R.id.imgBaixada);
    }

    public void downloadImagem(View view) {
        DownloadAsynkTask downloadAsynkTask = new DownloadAsynkTask();
        downloadAsynkTask.execute(edtURL.getText().toString()); //passando a URL

    }

    private class DownloadAsynkTask extends AsyncTask<String, Void,Bitmap> {

        //... >> pode ter mais parâmetros(infinito)
        @Override
        protected Bitmap doInBackground(String... strings) {
            try{
                InputStream inputStream;
                Bitmap imagem;

                URL endereco = new URL(strings[0]);
                inputStream = endereco.openStream(); //abre a conexao com a net
                imagem = BitmapFactory.decodeStream(inputStream); //le e transforma em um bitmap

                inputStream.close();

                return imagem;

            }catch(Exception e){
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            mProgressDialog = ProgressDialog.show(
                    MainActivity.this,
                    getString(R.string.download),
                    getString(R.string.aguardeDownload));
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if(bitmap != null){
                imgBaixada.setImageBitmap(bitmap);
            }else{
                Toast.makeText(MainActivity.this, getString(R.string.naoEncontrada), Toast.LENGTH_LONG);
            }

            mProgressDialog.dismiss(); //fecha o ProgressDialog

        }
    }
}

