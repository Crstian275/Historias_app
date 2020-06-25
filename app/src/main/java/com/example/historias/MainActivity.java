package com.example.historias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView = findViewById(R.id.wvPrincipal);


        WebSettings webSettings = WebView.getSettings();
        WebView.getSettings().setDomStorageEnabled(true);
        WebView.getSettings().setJavaScriptEnabled(true);
        webSettings.setJavaScriptEnabled(true);


        WebView.loadUrl("http://185.254.204.145/");
//webView.loadUrl("http://185.254.206.236/");
        WebView.setWebViewClient(new WebViewClient());


    }
}