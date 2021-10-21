package com.example.audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audioPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioPlayer = MediaPlayer.create(this, R.raw.bay);
    }

    public void playMusic(View view) {
        audioPlayer.start();
    }

    public void stopMusic(View view) {
        audioPlayer.stop();
    }
}