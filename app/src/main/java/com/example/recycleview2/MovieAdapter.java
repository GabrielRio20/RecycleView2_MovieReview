package com.example.recycleview2;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private final ArrayList<Movie> listmovies;

    public MovieAdapter(ArrayList<Movie> movies) {
        this.listmovies = movies;
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        final Movie movie = listmovies.get(position);
        Glide.with(holder.itemView.getContext()).load(movie.getImage()).apply(new RequestOptions()
                .override(100, 100)).into(holder.miniPicture);
        holder.txtTitle.setText(movie.getTitle());
        holder.txtDirector.setText(movie.getDirector());
        holder.txtReview.setText(movie.getReview());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailMovieActivity.class);
                Bundle bundle = new Bundle();

                bundle.putInt("picture", movie.getImage());
                bundle.putString("title", movie.getTitle());
                bundle.putString("director", movie.getDirector());
                bundle.putString("review", movie.getReview());

                intent.putExtras(bundle);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listmovies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtDirector, txtReview;
        ImageView miniPicture;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            miniPicture = itemView.findViewById(R.id.mini_picture);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDirector = itemView.findViewById(R.id.txt_director);
            txtReview = itemView.findViewById(R.id.txt_review);
        }
    }
}
