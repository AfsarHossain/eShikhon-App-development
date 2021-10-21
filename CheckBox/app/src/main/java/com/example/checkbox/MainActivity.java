package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox pCb, bCb, cCb;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pCb  = findViewById(R.id.cb1);
        bCb = findViewById(R.id.cb2);
        cCb = findViewById(R.id.cb3);
        textView = findViewById(R.id.displayText);
    }

    public void order(View view) {

        int total = 0;

        StringBuilder result = new StringBuilder();
        result.append("Selected Items : ");

        if(pCb.isChecked()) {
            result.append("\nPizza 50taka");
            total += 50;
        }
        if(bCb.isChecked()) {
            result.append("\nBurger 100taka");
            total += 100;
        }
        if(cCb.isChecked()) {
            result.append("\nCoffee 10taka");
            total += 10;
        }

        result.append("\nTotal : "+total+" taka\n");

        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

        textView.setText(result);
    }
}