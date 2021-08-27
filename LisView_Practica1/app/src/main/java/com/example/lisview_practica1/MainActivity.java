package com.example.lisview_practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String [] categorias = {"Verduras","Hamburguesas","Tomates","Manzanas","Nutella"
            ,"Pollo","Carne","Sopas","Sandwich","Galletas","Coca-Cola","Pepsi","Pizza","Comida China"};

    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1= (ListView) findViewById(R.id.listview);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, categorias);

        lv1.setAdapter(adaptador);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Usted ha seleccionado: " +categorias[position],Toast.LENGTH_SHORT).show();

            }
        });
    }



}