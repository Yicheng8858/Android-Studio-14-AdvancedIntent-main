package com.example.android_num_14_advancedintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        open_web();
    }
    public void open_web(){
        WebView webView = (WebView)findViewById(R.id.web1);
        webView.loadUrl("http://www.google.com");
        finish();//開啟後關閉XML
    }
}