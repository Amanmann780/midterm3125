package com.midtermmad3125;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class city extends AppCompatActivity {
    public class City {

        private  int id;
        private String name;
        private String lon;
        private  String lat;
        private String country;
        private  String population;


        public City(int id, String name, String lon, String lat, String country, int population) {
            this.id = id;
            this.name = name;
            this.lon = lon;
            this.lat = lat;
            this.country = country;
            this.population = population;
        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
    }
}
