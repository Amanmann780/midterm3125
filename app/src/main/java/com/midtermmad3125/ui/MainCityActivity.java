package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.midtermmad3125.utils.ReadJSONUtils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;


public class MainCityActivity extends AppCompatActivity
{
    private static final String TAG = ;

    private void parseJson(String JsonString) {
        Log.e(TAG,"Into Parse JSon"
            String JsonString = ReadJSONUtils.loadJSONFromAsset(this, "moscow_weather.json");
    if (!JSONStringer.is Empty() )

        try {
            JSONObject mJsonWeather = new JSONObject(jsonString);
            JSONObject mcity = mJsonWeather.getJSONObject("city");
            int id = mcity.getInt("id");
            Log.e(TAG, id + "");
            String name = mcity.getString("name");
            JSONObject mCoord = mcity.getJSONObject("cord");
            String lon = mCoord.getString("lon");
            String lat = mCoord.getString("lat");
            Log.e(TAG, lat + "");
            String country = mcity.getString("country");
            int population = mcity.getInt("population");
            int mCnt = mJsonWeather.getInt("cnt");
            JSONArray mListArray = mJsonWeather.getJSONArray("list");
            for(int i=0;i<mListArray.length();i++) {
                JSONObject mJsonObjectList = mListArray.getJSONObject(i);
                int dt = mJsonObjectList.getInt("dt");
                Log.e(TAG,dt +"dt");
                JSONObject mTemp = mJsonObjectList.getJSONObject("temp");
                String min = mTemp.getString("min");
                String max = mTemp.getString("max");
                Log.e(TAG,max +"max");
                String night = mTemp.getString("night");
                String eve = mTemp.getString("eve");
                String morn = mTemp.getString("morn");
                String pressure = mJsonObjectList.getString("pressure");
                int humidity = mJsonObjectList.getInt("humidity");
                JSONArray weatherArray = mJsonObjectList.getJSONArray("weather");

                for(int j=0;j<weatherArray.length();j++) {
                    JSONObject mJsonWeatherList = weatherArray.getJSONObject(j);
                    int idWheather= mJsonWeatherList.getInt("id");
                    Log.e(TAG,idWheather +"idWheather");
                    String main = mJsonWeatherList.getString("main");
                    String description = mJsonWeatherList.getString("description");
                    String icon = mJsonWeatherList.getString("icon");
                }
                String speed = mJsonObjectList.getString("speed");
                Log.e(TAG,speed +"speed");
                int deg = mJsonObjectList.getInt("deg");
                int clouds = mJsonObjectList.getInt("clouds");
                Log.e(TAG,clouds +"clouds");



            }
        }