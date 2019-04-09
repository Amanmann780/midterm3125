package com.midtermmad3125;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.midtermmad3125.ui.MainCityActivity;

public class SplashScreen extends AppCompatActivity {
    private static int SplashWait = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent LoginIntent = new Intent(SplashScreen.this, MainCityActivity.class);
                startActivity(LoginIntent);
                finish();

            }
        },SplashWait);
    }
}