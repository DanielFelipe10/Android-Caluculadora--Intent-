package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Restar extends AppCompatActivity {

    EditText numero1, numero2;
    Button realizar;

    int Res = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);

        numero1 = findViewById(R.id.num1);
        numero2 = findViewById(R.id.num2);
        realizar = findViewById(R.id.RealizarR);

        realizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Parseo de los EditText
                String n1 = numero1.getText().toString();
                int Num1 = Integer.parseInt(n1);
                String n2 = numero2.getText().toString();
                int Num2 = Integer.parseInt(n2);

                //Operación
                Res = Num1-Num2;

                //Creación del Alert
                AlertDialog.Builder resultado = new AlertDialog.Builder(Restar.this);
                resultado.setMessage(Num1+" - "+Num2+" = "+Res);
                resultado.setCancelable(false);
                resultado.setNegativeButton("¡HECHO!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                        numero1.setText("");
                        numero2.setText("");

                    }
                });
                AlertDialog titulo = resultado.create();
                titulo.setTitle("Resultado");
                titulo.show();
            }
        });
    }
}