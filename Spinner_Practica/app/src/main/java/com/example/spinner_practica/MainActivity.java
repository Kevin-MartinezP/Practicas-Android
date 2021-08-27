package com.example.spinner_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private String [] categorias;
   private Spinner spi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spi= (Spinner) findViewById(R.id.spinner);
        categorias = getResources().getStringArray(R.array.categorias);
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1,categorias);
        spi.setAdapter(adaptador);

        spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Usted selecciono: "+categorias[position], Toast.LENGTH_SHORT);
                t1.show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                
            }
        });

    }
}