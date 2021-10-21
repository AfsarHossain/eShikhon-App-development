package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RadioInputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_input);

        TextView textViewForEt = findViewById(R.id.textet);
        TextView textView = findViewById(R.id.text);

        Bundle extras = getIntent().getExtras();

        if(extras != null)
        {
            String message = extras.getString("Choosen");
            textView.setText(message);

            Intent intent = getIntent();
            String str = intent.getStringExtra("Editable");
            textViewForEt.setText(str);
        }
    }
}