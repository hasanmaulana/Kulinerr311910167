package com.example.kulinerr311910167;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent utamaIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(utamaIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
