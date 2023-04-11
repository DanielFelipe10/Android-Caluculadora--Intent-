package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sumar, restar, multiplicar, dividir, mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumar = findViewById(R.id.suma);
        restar = findViewById(R.id.resta);
        multiplicar = findViewById(R.id.mult);
        dividir = findViewById(R.id.div);
        mapa = findViewById(R.id.mapa);

        //Button SUMAR
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSuma = new Intent(MainActivity.this, Sumar.class);
                startActivity(intentSuma);
            }
        });

        //Button RESTAR
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentResta = new Intent(MainActivity.this, Restar.class);
                startActivity(intentResta);
            }
        });

        //Button MULTIPLICAR
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMultiplicacion = new Intent(MainActivity.this, Multiplicar.class);
                startActivity(intentMultiplicacion);
            }
        });

        //Button DIVIDIR
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDivision = new Intent(MainActivity.this, Dividir.class);
                startActivity(intentDivision);
            }
        });

        //Button MAPA
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMapa = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intentMapa);
            }
        });
    }
}