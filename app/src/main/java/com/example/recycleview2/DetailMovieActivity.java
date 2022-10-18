package com.example.recycleview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailMovieActivity extends AppCompatActivity {
    TextView txtTitle, txtDirector, txtReview;
    String title, director, review;
    ImageView image;
    int picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        getSupportActionBar().hide();

        image = findViewById(R.id.picture);
        txtTitle = findViewById(R.id.txt_title);
        txtDirector = findViewById(R.id.txt_director);
        txtReview  = findViewById(R.id.txt_review);

        Bundle bundle = getIntent().getExtras();
        picture = bundle.getInt("picture");
        title = bundle.getString("title");
        director = bundle.getString("director");
        review = bundle.getString("review");

        txtTitle.setText(title);
        txtDirector.setText(director);
        txtReview.setText(review);
        Glide.with(DetailMovieActivity.this).load(picture).apply(new RequestOptions()
                .override(1000, 1000)).into(image);

    }
}