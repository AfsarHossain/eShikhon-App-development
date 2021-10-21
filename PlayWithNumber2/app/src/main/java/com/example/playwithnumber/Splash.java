package com.example.playwithnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    private static final int duraction = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent gotoNew = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(gotoNew);
                Splash.this.finish();
            }
        }, duraction);
    }
}