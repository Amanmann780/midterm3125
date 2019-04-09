package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class weatherlist extends AppCompatActivity {
    private int dt;
    private String min;
    private String max;
    private  String night;
    private String eve;
    private  String morn;
    private String pressure;
    private  int humidity;
    private  int idWheather;
    private String main;
    private String description;
    private String icon;
    private String speed;
    private int deg;
    private  int clouds;

    public int getDt() {
        return dt;
    }
    public void setDt(int dt) {
        this.dt = dt;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night;
    }

    public String getEve() {
        return eve;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weatherlist);
    }
}
