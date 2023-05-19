package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialCardView idMenuPets, MenuLoja, MenuDoacao, MenuServicos, MenuParceiros, MenuLocalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);

        idMenuPets = findViewById(R.id.MenuPets);
        MenuLoja = findViewById(R.id.MenuLoja);
        MenuDoacao = findViewById(R.id.MenuDoacao);
        MenuServicos = findViewById(R.id.MenuServicos);
        MenuParceiros = findViewById(R.id.MenuParceiros);
        MenuLocalizar = findViewById(R.id.MenuLocalizar);

        idMenuPets.setOnClickListener(this);
        MenuLoja.setOnClickListener(this);
        MenuDoacao.setOnClickListener(this);
        MenuServicos.setOnClickListener(this);
        MenuParceiros.setOnClickListener(this);
        MenuLocalizar.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.MenuPets) {
            startActivity(new Intent(getApplicationContext(), PetsActivity.class));
        } else if (v.getId() == R.id.MenuLoja) {
            startActivity(new Intent(getApplicationContext(), AlimentosActivity.class));
        }
    }
}

