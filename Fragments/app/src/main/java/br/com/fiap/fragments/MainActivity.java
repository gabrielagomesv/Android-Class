package br.com.fiap.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirFragment1(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new MeuFragment())
                .addToBackStack(null)
                .commit();
    }

    public void abrirFragment2(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new OutroFragment())
                .addToBackStack(null)
                .commit();
    }
}
