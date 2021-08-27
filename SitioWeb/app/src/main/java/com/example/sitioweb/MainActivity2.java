package com.example.sitioweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {

    WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        wb1 = (WebView)findViewById(R.id.webView);

        String URL = getIntent().getStringExtra("sitioweb");
        wb1.setWebViewClient(new WebViewClient());
        wb1.loadUrl("http://" +URL);
    }

    public void Cerrar(View view){
      finish();
    }
}