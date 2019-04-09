package com.midtermmad3125.ui;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.midtermmad3125.R;
import com.midtermmad3125.utils.ReadJSONUtils;

public class MainCityActivity extends AppCompatActivity
{
    public void parseJson() {
    Log.e(TAG,"Into Parse JSon"
            String jsonString = ReadJSONUtils.loadJSONFromAsset(this, "moscow_weather.json");
    if (!jsonString.isEmpty()) {
        try {
            JSONObject mJsonWeather = new JSONObject(jsonString);
            //City Data
            JSONObject mCity = mJsonWeather.getJSONObject("city");
            //Data of City
            int id = mCity.getInt("id");
            Log.e(TAG, id + "");
            String name = mCity.getString("name");
            //Data of City Coord
            JSONObject mCoord = mCity.getJSONObject("cord");
            String lon = mCoord.getString("lon");
            String lat = mCoord.getString("lat");
            Log.e(TAG, lat + "");
            //Data of City
            String country = mCity.getString("country");
            int population = mCity.getInt("population");
            //City Count
            int mCnt = mJsonWeather.getInt("cnt");
            //City List
        }
    }}