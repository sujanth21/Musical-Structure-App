package com.sujanth.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        ImageView home = (ImageView) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(MusicLibraryActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        ImageView music_playlist = (ImageView) findViewById(R.id.playlist_button);
        music_playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MusicLibraryActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
