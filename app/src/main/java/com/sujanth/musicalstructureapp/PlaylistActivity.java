package com.sujanth.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ImageView home = (ImageView) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        ImageView library = (ImageView) findViewById(R.id.library_button);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(PlaylistActivity.this, MusicLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        ImageView play_song_one = (ImageView) findViewById(R.id.play_song_one_button);
        play_song_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playMusicIntent = new Intent(PlaylistActivity.this, PlayMusic.class);
                startActivity(playMusicIntent);
            }
        });

        ImageView play_song_two = (ImageView) findViewById(R.id.play_song_two_button);
        play_song_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playMusicIntent = new Intent(PlaylistActivity.this, PlayMusic.class);
                startActivity(playMusicIntent);
            }
        });

        ImageView play_song_three = (ImageView) findViewById(R.id.play_song_three_button);
        play_song_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playMusicIntent = new Intent(PlaylistActivity.this, PlayMusic.class);
                startActivity(playMusicIntent);
            }
        });

        ImageView play_song_four = (ImageView) findViewById(R.id.play_song_four_button);
        play_song_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playMusicIntent = new Intent(PlaylistActivity.this, PlayMusic.class);
                startActivity(playMusicIntent);
            }
        });

        ImageView play_song_five = (ImageView) findViewById(R.id.play_song_five_button);
        play_song_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playMusicIntent = new Intent(PlaylistActivity.this, PlayMusic.class);
                startActivity(playMusicIntent);
            }
        });

        ImageView play_song_six = (ImageView) findViewById(R.id.play_song_six_button);
        play_song_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playMusicIntent = new Intent(PlaylistActivity.this, PlayMusic.class);
                startActivity(playMusicIntent);
            }
        });

        ImageView play_song_seven = (ImageView) findViewById(R.id.play_song_seven_button);
        play_song_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playMusicIntent = new Intent(PlaylistActivity.this, PlayMusic.class);
                startActivity(playMusicIntent);
            }
        });
    }
}
