package com.example.kulinerr311910167;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

public class WebFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_web, container, false);
        WebView myWebView = myView.findViewById(R.id.wv_web);
        myWebView.loadUrl("https://www.google.com");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
// Inflate the layout for this fragment
        return myView;
    }
}