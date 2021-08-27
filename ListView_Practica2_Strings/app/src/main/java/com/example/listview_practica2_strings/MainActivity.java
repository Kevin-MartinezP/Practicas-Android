package com.example.listview_practica2_strings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    String [] categorias;

    ListView lv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1= (ListView) findViewById(R.id.listview);
        categorias = getResources().getStringArray(R.array.categorias);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1,categorias);
        lv1.setAdapter(adaptador);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast t1= Toast.makeText(getApplicationContext(), "Usted selecciono como su comida favorita: "+categorias[position],Toast.LENGTH_SHORT);
                t1.show();
            }
        });
    }
}