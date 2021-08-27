package com.example.sitioweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tv_url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_url = (EditText)findViewById(R.id.txt_url);


    }

    public void Sitio(View view){

        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("sitioweb", tv_url.getText().toString());
        startActivity(i);
    }

}