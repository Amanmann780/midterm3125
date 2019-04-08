package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.midtermmad3125.R;
import com.midtermmad3125.utils.ReadJSONUtils;

public class MainCityActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void parsonjson()
    public jsonString = ReadjsonUtils.loadJSONFromAsset(context this, json){
        String json;
         }
JSONObject mJsonWeather = new JSONObject(jsonString);
    //City Data
    JSONObject mCity = mJsonWeather.getJSONObject(“city”);
    //City Count
    JSONObject mCnt = mJsonWeather.getJSONObject(“cnt”);
    //City List
    JSONArray mList = mJsonWeather.getJSONArray(“list”);
              Log.e(TAG,mCity.toString()+mCnt+mList);
} catch (JSONException e) {
        e.printStackTrace();
        }

//json