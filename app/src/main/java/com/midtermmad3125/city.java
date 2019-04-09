package com.midtermmad3125;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.StaticLayout;

import java.util.ArrayList;

public class city extends AppCompatActivity {
    public static class City {

        private int id;
        private String name;
        private String lon;
        private String lat;
        private String country;
        private String population;


        public City(int id, String name, String lon, String lat, String country, String population) {
            this.id = id;
            this.name = name;
            this.lon = lon;
            this.lat = lat;
            this.country = country;
            this.population = population;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getPopulation() {
            return population;
        }

        public void setPopulation(String population) {
            this.population = population;
        }

        private static ArrayList<City> cityList = new ArrayList<City>();

        public static void createArrayList(City city) {
            cityList.add(city);
        }

        public static ArrayList<City> getArrayList() {
            return cityList;
        }

    }}

