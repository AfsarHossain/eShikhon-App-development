package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imgV1, imgV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgV1 = findViewById(R.id.image1);
        imgV2 = findViewById(R.id.image2);
        btn = findViewById(R.id.animBtn);

        imgV1.animate().alpha(1f).setDuration(5000);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgV2.animate().alpha(0f).setDuration(2000);
                //imgV2.animate().translationX(1000f).setDuration(3000);
                //imgV2.animate().translationX(-1000f).setDuration(3000);
                //imgV2.animate().translationY(1000f).setDuration(3000);
                //imgV2.animate().translationY(-1000f).setDuration(3000);
                //imgV2.animate().translationXBy(1000f).setDuration(3000);
                //imgV2.animate().rotation(90f).setDuration(3000);
                //imgV2.animate().rotation(180f).setDuration(3000);
                //imgV2.animate().rotation(360f).setDuration(3000);
                //imgV2.animate().rotation(-360f).setDuration(3000);
                //imgV2.animate().scaleX(0.5f).scaleY(.5f).setDuration(3000);
                //imgV2.animate().translationXBy(1000f).translationYBy(1000f).rotation(90f).setDuration(3000);
                //imgV2.animate().translationXBy(1000f).translationYBy(-1000f).rotation(90f).setDuration(3000);
            }
        });
    }
}