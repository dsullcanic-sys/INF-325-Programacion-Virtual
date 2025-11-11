package com.example.monedas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    // Tasas de referencia (22/08/2025)
    private static final double USD_BOB = 6.96;   // 1 USD = 6.96 BOB
    private static final double EUR_BOB = 8.01;   // 1 EUR = 8.01 BOB
    private static final double GBP_BOB = 9.28;   // 1 GBP = 9.28 BOB
    private static final double JPY_BOB = 0.04661;// 1 JPY = 0.04661 BOB
    private static final double MXN_BOB = 0.369;  // 1 MXN = 0.369 BOB
    private static final double BRL_BOB = 1.273;  // 1 BRL = 1.273 BOB
    private static final double ARS_BOB = 0.00525;// 1 ARS = 0.00525 BOB

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertir(View vista){
        EditText m1 = (EditText) findViewById(R.id.editText1); // Bolivianos
        EditText m2 = (EditText) findViewById(R.id.editText2); // USD
        EditText m3 = (EditText) findViewById(R.id.editText3); // EUR
        EditText m4 = (EditText) findViewById(R.id.editText4); // GBP
        EditText m5 = (EditText) findViewById(R.id.editText5); // JPY
        EditText m6 = (EditText) findViewById(R.id.editText6); // MXN
        EditText m7 = (EditText) findViewById(R.id.editText7); // BRL
        EditText m8 = (EditText) findViewById(R.id.editText8); // ARS

        EditText[] campos = {m1, m2, m3, m4, m5, m6, m7, m8};

        // 1. Detectar el campo con valor
        double valorIngresado = 0;
        int campoOrigen = -1;

        for(int i = 0; i < campos.length; i++){
            if(campos[i].getText().toString().trim().length() > 0){
                try {
                    valorIngresado = Double.parseDouble(campos[i].getText().toString());
                    campoOrigen = i;
                    break;
                } catch (NumberFormatException e){
                    campos[i].setError("Numero invalido");
                    return;
                }
            }
        }

        if(campoOrigen == -1){
            m1.setError("Ingrese un valor en algun campo");
            return;
        }

        // 2. Convertir a USD como base
        double usd = 0;
        switch (campoOrigen){
            case 0: usd = valorIngresado / USD_BOB; break;   // BOB -> USD
            case 1: usd = valorIngresado; break;            // USD
            case 2: usd = (valorIngresado * EUR_BOB) / USD_BOB; break; // EUR -> USD
            case 3: usd = (valorIngresado * GBP_BOB) / USD_BOB; break; // GBP -> USD
            case 4: usd = (valorIngresado * JPY_BOB) / USD_BOB; break; // JPY -> USD
            case 5: usd = (valorIngresado * MXN_BOB) / USD_BOB; break; // MXN -> USD
            case 6: usd = (valorIngresado * BRL_BOB) / USD_BOB; break; // BRL -> USD
            case 7: usd = (valorIngresado * ARS_BOB) / USD_BOB; break; // ARS -> USD
        }

        // 3. Convertir desde USD a todas las monedas
        double v1 = usd * USD_BOB;      // BOB
        double v2 = usd;                // USD
        double v3 = usd * (USD_BOB / EUR_BOB); // EUR
        double v4 = usd * (USD_BOB / GBP_BOB); // GBP
        double v5 = usd * (USD_BOB / JPY_BOB); // JPY
        double v6 = usd * (USD_BOB / MXN_BOB); // MXN
        double v7 = usd * (USD_BOB / BRL_BOB); // BRL
        double v8 = usd * (USD_BOB / ARS_BOB); // ARS

        // 4. Mostrar resultados con 2 decimales
        m1.setText(String.format("%.2f", v1));
        m2.setText(String.format("%.2f", v2));
        m3.setText(String.format("%.2f", v3));
        m4.setText(String.format("%.2f", v4));
        m5.setText(String.format("%.2f", v5));
        m6.setText(String.format("%.2f", v6));
        m7.setText(String.format("%.2f", v7));
        m8.setText(String.format("%.2f", v8));
    }
    
    public void limpiar(View vista) {
        EditText m1 = (EditText) findViewById(R.id.editText1);
        EditText m2 = (EditText) findViewById(R.id.editText2);
        EditText m3 = (EditText) findViewById(R.id.editText3);
        EditText m4 = (EditText) findViewById(R.id.editText4);
        EditText m5 = (EditText) findViewById(R.id.editText5);
        EditText m6 = (EditText) findViewById(R.id.editText6);
        EditText m7 = (EditText) findViewById(R.id.editText7);
        EditText m8 = (EditText) findViewById(R.id.editText8);
        
        // Limpiar todos los campos
        m1.setText("");
        m2.setText("");
        m3.setText("");
        m4.setText("");
        m5.setText("");
        m6.setText("");
        m7.setText("");
        m8.setText("");
        
        // Opcional: quitar posibles mensajes de error
        m1.setError(null);
        m2.setError(null);
        m3.setError(null);
        m4.setError(null);
        m5.setError(null);
        m6.setError(null);
        m7.setError(null);
        m8.setError(null);
        
        // Opcional: regresar el foco al primer campo
        m1.requestFocus();
    }
    
    public void salir(View vista) {
        // Cerrar la actividad actual
        finish();
        
        // Opcional: forzar cierre completo de la app (para Android más reciente)
        // android.os.Process.killProcess(android.os.Process.myPid());
        // System.exit(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
