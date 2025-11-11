package com.example.calculadoraok;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    double[][] guardar = new double[3][10];
    int i=0;
    int j=0;
    int k=0;
    public void sumar(View vista){
    	EditText pv1 = (EditText) findViewById(R.id.editText1);
    	double valor1= Double.parseDouble((pv1.getText().toString()));
    	EditText pv2 = (EditText) findViewById(R.id.editText2);
    	double valor2= Double.parseDouble((pv2.getText().toString()));
    	
    	EditText pv3 = (EditText) findViewById(R.id.editText3);
    	double resultado = valor1 + valor2;
    	almacenar(valor1, valor2, resultado);
    	pv3.setText(resultado+"");
    }
    public void restar(View vista){
    	EditText pv1 = (EditText) findViewById(R.id.editText1);
    	double valor1= Double.parseDouble((pv1.getText().toString()));
    	EditText pv2 = (EditText) findViewById(R.id.editText2);
    	double valor2= Double.parseDouble((pv2.getText().toString()));
    	
    	EditText pv3 = (EditText) findViewById(R.id.editText3);
    	double resultado = valor1 - valor2;
    	almacenar(valor1, valor2, resultado);
    	pv3.setText(resultado+"");
    }
    public void multiplicacion(View vista){
    	EditText pv1 = (EditText) findViewById(R.id.editText1);
    	double valor1= Double.parseDouble((pv1.getText().toString()));
    	EditText pv2 = (EditText) findViewById(R.id.editText2);
    	double valor2= Double.parseDouble((pv2.getText().toString()));
    	
    	EditText pv3 = (EditText) findViewById(R.id.editText3);
    	double resultado = valor1 * valor2;
    	almacenar(valor1, valor2, resultado);
    	pv3.setText(resultado+"");
    }
    public void division(View vista){
    	EditText pv1 = (EditText) findViewById(R.id.editText1);
    	double valor1= Double.parseDouble((pv1.getText().toString()));
    	EditText pv2 = (EditText) findViewById(R.id.editText2);
    	double valor2= Double.parseDouble((pv2.getText().toString()));
    	
    	EditText pv3 = (EditText) findViewById(R.id.editText3);
    	double resultado = valor1 / valor2;
    	almacenar(valor1, valor2, resultado);
    	pv3.setText(resultado+"");
    }
    public void limpiar(View Vista){
    	EditText pv1 = (EditText) findViewById(R.id.editText1);
    	EditText pv2 = (EditText) findViewById(R.id.editText2);
    	EditText pv3 = (EditText) findViewById(R.id.editText3);
    	pv1.setText("");
    	pv2.setText("");
    	pv3.setText("");
    }
    public void historial(View Vista){
    	EditText pv1 = (EditText) findViewById(R.id.editText1);
    	EditText pv2 = (EditText) findViewById(R.id.editText2);
    	EditText pv3 = (EditText) findViewById(R.id.editText3);

    	pv1.setText(guardar[0][j]+"");
    	pv2.setText(guardar[1][j]+"");
    	pv3.setText(guardar[2][j]+"");
    	j++;
    	if(j == 10 || j == k){
    		j=0;
    	}
    	if(j == k){
    		j=0;
    	}
    }
    public void almacenar(double a,double b, double c){
    	guardar[0][i]=a;
    	guardar[1][i]=b;
    	guardar[2][i]=c;
    	i++;
    	k++;
    	if(i == 10){
    		i=0;
    	}
    	if(k>=10){
    		k=9;
    	}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
