package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dividir extends AppCompatActivity {

    EditText numero1, numero2;
    Button realizar;

    double Res = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);

        numero1 = findViewById(R.id.num1);
        numero2 = findViewById(R.id.num2);
        realizar = findViewById(R.id.RealizarD);

        realizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Parseo de los EditText
                String n1 = numero1.getText().toString();
                double Num1 = Double.parseDouble(n1);
                String n2 = numero2.getText().toString();
                double Num2 = Double.parseDouble(n2);

                //Operación
                Res = Num1/Num2;

                //Creación del Alert
                AlertDialog.Builder resultado = new AlertDialog.Builder(Dividir.this);
                resultado.setMessage(Num1+" ÷ "+Num2+" = "+Res);
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