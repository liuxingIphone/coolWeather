package com.chen.cooltest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.chen.cooltest.db.City;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String weatherStr =  prefs.getString("weather", null);


        if (weatherStr != null){

            Intent intent = new Intent(this, Weatherctivity.class);
            startActivity(intent);
            finish();
        }


    }
}
