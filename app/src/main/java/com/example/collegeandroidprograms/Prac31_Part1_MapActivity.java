package com.example.collegeandroidprograms;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Prac31_Part1_MapActivity extends AppCompatActivity {

    WebView mapWebView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac31_part1_map);

        Bundle bundle = getIntent().getExtras();
        mapWebView = findViewById(R.id.mapWebView);

        mapWebView.setWebViewClient(new MyWebViewClient());
        mapWebView.getSettings().setJavaScriptEnabled(true);

        String lat = bundle.getString("Latitude");
        String lon = bundle.getString("Longitude");
        String locationLink = "https://www.google.com/maps/search/?api=1&query="+lat+","+lon;
        mapWebView.loadUrl(locationLink);
    }

    public final class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            Intent i = new Intent(Intent.ACTION_VIEW, request.getUrl());
            startActivity(i);
            return true;
        }
    }
}