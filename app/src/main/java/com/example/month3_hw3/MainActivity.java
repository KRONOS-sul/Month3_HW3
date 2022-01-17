package com.example.month3_hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static boolean isMainFragment = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager();
        getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment_1()).commit();
    }

}