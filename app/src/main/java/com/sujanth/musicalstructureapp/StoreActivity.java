package com.sujanth.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        ImageView home = (ImageView) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(StoreActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        ImageView library = (ImageView) findViewById(R.id.library_button);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(StoreActivity.this, MusicLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
    }
}
