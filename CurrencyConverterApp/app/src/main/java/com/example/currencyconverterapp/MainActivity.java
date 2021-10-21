package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertNow(View view) {
        EditText editText = findViewById(R.id.textEdit);
        TextView textView = findViewById(R.id.displayText);

        String taka = editText.getText().toString();
        Double takaD = Double.parseDouble(taka);
        Double dolar = takaD * 0.012;

        String dolarS = String.valueOf(dolar);

        textView.setText(dolarS);
    }
}