package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class PetsActivity extends AppCompatActivity {

    TabLayout tbPets;
    TabItem idItemCachorro,idItemGato, idItemPassaro;
    ViewPager2 idViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets_layout);


        tbPets = findViewById(R.id.idTabLayout);
        idViewPager = findViewById(R.id.idViewPagerPets);


    }
}