package com.example.nikol.ctvrtahodina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image);
        Glide
                .with(this)
                .load("https://img.csfd.cz/files/images/film/posters/162/505/162505167_735db9.jpg")
                .into(imageView);


    }
}
