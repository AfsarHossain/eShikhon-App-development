package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoPlayer = findViewById(R.id.videoView);
        videoPlayer.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.heart);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mediaController);
        videoPlayer.setMediaController(mediaController);
    }

    public void playVideo(View view) {

        videoPlayer.start();
    }

    public void stopVideo(View view) {

        videoPlayer.stopPlayback();
    }
}