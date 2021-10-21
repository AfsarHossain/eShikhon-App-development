package com.example.playwithnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText userInp;
    Button guessNo;

    int appNum, userNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInp = findViewById(R.id.userET);
        guessNo = findViewById(R.id.submitBtn);

        Random rand = new Random();
        appNum = rand.nextInt(10) + 1;

        guessNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNo = userInp.getText().toString().trim();

                userNum = Integer.parseInt(userNo);

                if(userNum < appNum) {
                    Toast.makeText(MainActivity.this, "Enter a higher number", Toast.LENGTH_SHORT).show();
                }else if(userNum > appNum) {
                    Toast.makeText(MainActivity.this, "Enter a lower number", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Congrates!! Your Number is correct", Toast.LENGTH_SHORT).show();
                    userInp.setText(" ");
                    Random rand = new Random();

                    appNum = rand.nextInt(10) + 1;

                }
            }
        });
    }
}