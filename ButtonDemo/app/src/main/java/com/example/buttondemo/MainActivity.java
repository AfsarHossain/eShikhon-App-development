package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goBtnAct(View view) {
        Toast.makeText(MainActivity.this, "Button Click Me", Toast.LENGTH_SHORT).show();

        Intent secondPage = new Intent(MainActivity.this, SecondPage.class);
        startActivity(secondPage);
    }
}