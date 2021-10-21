package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton1, toggleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton1 = findViewById(R.id.tb1);
        toggleButton2 = findViewById(R.id.tb2);
    }

    public void submit(View view) {

        StringBuilder result = new StringBuilder();

        result.append("Toggle Button1 : ").append(toggleButton1.getText());
        result.append("\nToggle Button2 : ").append(toggleButton2.getText());

        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }
}