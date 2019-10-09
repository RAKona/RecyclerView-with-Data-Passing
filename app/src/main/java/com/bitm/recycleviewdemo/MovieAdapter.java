package com.bitm.recycleviewdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {


    public MovieAdapter(List<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    private List<Movie> movies;
    private Context context;



    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_movierecyclerview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {

        final Movie movie = movies.get(position);

        holder.movienameTV.setText(movie.getMoviename());
        holder.directornameTV.setText(movie.getDirectorname());
        holder.movieimage.setImageResource(movie.getMovieimage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,MovieDetailsActivity.class);
                intent.putExtra("moviename",movie.getMoviename());
                intent.putExtra("directorname",movie.getDirectorname());
                intent.putExtra("movieimage",String.valueOf(movie.getMovieimage()));
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView movienameTV,directornameTV;
        private ImageView movieimage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            movienameTV=itemView.findViewById(R.id.movienameTV);
            directornameTV=itemView.findViewById(R.id.directornameTV);
            movieimage=itemView.findViewById(R.id.movieimage);
        }
    }
}
