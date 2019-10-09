package com.bitm.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MovieDetailsActivity extends AppCompatActivity {

    private TextView nameTV,directorTV;
    private ImageView movieIV;
    private String moviename,directorname,image;
    private int imagelink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);


        init();

        getData();

        setData();
    }

    private void setData() {

        nameTV.setText(moviename);
        directorTV.setText(directorname);
        movieIV.setImageResource(imagelink);
    }

    private void getData() {

        moviename= getIntent().getStringExtra("moviename");
        directorname=getIntent().getStringExtra("directorname");
        image=getIntent().getStringExtra("movieimage");
        imagelink=Integer.parseInt(image);


    }

    private void init() {
        nameTV=findViewById(R.id.nameTV);
        directorTV=findViewById(R.id.directorTV);
        movieIV=findViewById(R.id.movieIV);
    }
}
