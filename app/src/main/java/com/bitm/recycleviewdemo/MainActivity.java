package com.bitm.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Movie> movieList;
    private RecyclerView recyclerView;
    private MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itit();

        addData();
    }

    private void addData() {



      movieList.add(new Movie("Coco","Adrian Molina",R.drawable.coco));
      movieList.add(new Movie("Stroke","Chris Stokes",R.drawable.storks));
      movieList.add(new Movie("The Princess and the Frog","E. D. Baker",R.drawable.princesfrog));
      movieList.add(new Movie("Kung Fu Panda","John Stevenson ",R.drawable.kungfupanda));
      movieList.add(new Movie("Toy Story 4","John Lasseter",R.drawable.toystory));
      movieList.add(new Movie("Wonder Park","Dylan Brown",R.drawable.wonderpark));

      adapter.notifyDataSetChanged();
    }

    private void itit() {

        movieList=new ArrayList<>();

        recyclerView=findViewById(R.id.movierecycelerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new MovieAdapter(movieList,this);
        recyclerView.setAdapter(adapter);

    }
}
