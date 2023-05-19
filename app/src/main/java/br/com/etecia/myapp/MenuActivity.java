package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialCardView MenuPets, MenuLoja, MenuDoacao, MenuServicos,MenuParceiros, MenuLocalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);

        MenuPets = findViewById(R.id.MenuPets);
        MenuLoja = findViewById(R.id.MenuLoja);
        MenuDoacao= findViewById(R.id.MenuDoacao);
        MenuServicos = findViewById(R.id.MenuServicos);
        MenuParceiros = findViewById(R.id.MenuParceiros);
        MenuLocalizar = findViewById(R.id.MenuLocalizar);


    }

    @Override
    public void onClick(View v) {

    }
}