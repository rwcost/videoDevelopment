package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView mVideoView;
    MediaController mediaController;// next time change from widget
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the media controller
        mediaController = new MediaController(this);
        mVideoView = findViewById(R.id.mVideoView);
        mediaController.setAnchorView(mVideoView);
        Uri localUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dorcus);
        mVideoView.setVideoURI(localUri);
        mVideoView.setMediaController(mediaController);
        mVideoView.start();

    }
}