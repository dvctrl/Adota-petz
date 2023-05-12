package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash);

        // criando o carregamento da janela de login

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //abrindo a janela de login
                  startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                  //fechando a janela atual
                  finish();
            }
        },3000);

    }
}