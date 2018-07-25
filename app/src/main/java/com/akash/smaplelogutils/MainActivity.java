package com.akash.smaplelogutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.akash.logutils.DoDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DoDebug.D("myKey","Message: Hi Akash congrats");

    }
}
