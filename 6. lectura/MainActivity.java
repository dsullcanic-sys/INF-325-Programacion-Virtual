package com.example.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String estado = Environment.getExternalStorageState();
        if(!estado.equals(Environment.MEDIA_MOUNTED)){
            Toast.makeText(this, "Error NO SD CARD", Toast.LENGTH_LONG).show();
            finish();
        }

        try {
            File dir = Environment.getExternalStorageDirectory();
            File ptr = new File(dir.getAbsolutePath() + File.separator + "manualandroid.txt");
            BufferedReader lee = new BufferedReader(new InputStreamReader(new FileInputStream(ptr), "ISO-8859-1"));

            ListView lista = (ListView)findViewById(R.id.listView1);
            final TextView tv = (TextView)findViewById(R.id.textView4);

            final ArrayList<ItemManual> items = new ArrayList<ItemManual>();
            StringBuilder buffer = new StringBuilder();
            String currentTitulo = null;

            String linea;
            while ((linea = lee.readLine()) != null) {
                if (linea.startsWith("XYZ") || linea.startsWith("YYY") || linea.startsWith("ZZZ")) {
                    // Guardar el ítem anterior
                    if (currentTitulo != null) {
                        items.add(new ItemManual(currentTitulo, buffer.toString().trim()));
                        buffer.setLength(0);
                    }

                    // Definir sangría según el tipo
                    if (linea.startsWith("XYZ")) {
                        currentTitulo = linea.replace("XYZ", "");
                    } else if (linea.startsWith("YYY")) {
                        currentTitulo = "   " + linea.replace("YYY", "");
                    } else if (linea.startsWith("ZZZ")) {
                        currentTitulo = "      " + linea.replace("ZZZ", "");
                    }
                } else {
                    // Acumular contenido
                    buffer.append(linea).append("\n");
                }
            }
            // Guardar último ítem
            if (currentTitulo != null) {
                items.add(new ItemManual(currentTitulo, buffer.toString().trim()));
            }

            lee.close();

            ArrayAdapter<ItemManual> adaptador = new ArrayAdapter<ItemManual>(this, android.R.layout.simple_list_item_1, items);
            lista.setAdapter(adaptador);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ItemManual item = items.get(position);
                    tv.setText(item.contenido);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class ItemManual {
        String titulo;     // texto a mostrar en el ListView
        String contenido;  // contenido asociado
        ItemManual(String t, String c) {
            this.titulo = t;
            this.contenido = c;
        }
        @Override
        public String toString() {
            return titulo; // así se muestra en el ListView
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
