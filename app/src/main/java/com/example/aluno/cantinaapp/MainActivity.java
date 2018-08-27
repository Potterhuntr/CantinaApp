package com.example.aluno.cantinaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonMais1;
    private Button buttonMais2;
    private Button buttonMais3;
    private Button buttonMais4;
    private Button buttonMais5;
    private Button buttonMais6;
    private Button buttonMais7;

    private Button buttonMenos1;
    private Button buttonMenos2;
    private Button buttonMenos3;
    private Button buttonMenos4;
    private Button buttonMenos5;
    private Button buttonMenos6;
    private Button buttonMenos7;

    private Button buttonCalcular;

    private Button buttonPagar;

    private TextView textViewResultado;

    private double valor1;
    private double valor2;
    private double valor3;
    private double valor4;
    private double valor5;
    private double valor6;
    private double valor7;

    private Button buttonOka;
    private EditText editTextValor;
    private TextView textViewTroco;


    private double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        textViewResultado = (TextView) findViewById(R.id.textViewResultado);

        buttonCalcular = (Button) findViewById(R.id.buttonCalcular);

        buttonMais1 = (Button) findViewById(R.id.buttonMais1);
        buttonMais2 = (Button) findViewById(R.id.buttonMais2);
        buttonMais3 = (Button) findViewById(R.id.buttonMais3);
        buttonMais4 = (Button) findViewById(R.id.buttonMais4);
        buttonMais5 = (Button) findViewById(R.id.buttonMais5);
        buttonMais6 = (Button) findViewById(R.id.buttonMais6);
        buttonMais7 = (Button) findViewById(R.id.buttonMais7);

        buttonMenos1 = (Button) findViewById(R.id.buttonMenos1);
        buttonMenos2 = (Button) findViewById(R.id.buttonMenos3);
        buttonMenos3 = (Button) findViewById(R.id.buttonMenos3);
        buttonMenos4 = (Button) findViewById(R.id.buttonMenos4);
        buttonMenos5 = (Button) findViewById(R.id.buttonMenos5);
        buttonMenos6 = (Button) findViewById(R.id.buttonMenos6);
        buttonMenos7 = (Button) findViewById(R.id.buttonMenos7);



        buttonOka = (Button) findViewById(R.id.buttonOka);
        textViewTroco = (TextView) findViewById(R.id.textViewTroco);
        editTextValor = (EditText) findViewById(R.id.editTextValor);




        buttonMais1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor1 += 2.00;
            }   });

        buttonMenos1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor1-= 2.00;
            }   });


        buttonMais2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor2 += 0.10;
            }   });

        buttonMenos2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor2 -= 0.10;
            }   });


        buttonMais3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor3 += 0.50;
            }   });

        buttonMenos3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor3 -= 0.50;
            }   });


        buttonMais4.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor4 += 0.75;
            }   });

        buttonMenos4.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor4 -= 0.75;
            }   });


        buttonMais5.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor5 += 1.50;
            }   });

        buttonMenos5.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor5 -= 1.50;
            }   });


        buttonMais6.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor6 += 3.80;
            }   });

        buttonMenos6.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor6 -= 3.80;
            }   });


        buttonMais7.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor7 += 5.00;
            }   });

        buttonMenos7.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                valor7 -= 5.00;
            }   });


        buttonCalcular.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                resultado = (valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7);

                textViewResultado.setText("O valor é:"+(resultado));
            }   });


        buttonOka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valor1 = Double.parseDouble(editTextValor.getText().toString());
                double troco = (valor1-resultado);
                textViewTroco.setText("O valor de troco é: "+(troco));

            }
        });



    }


}


