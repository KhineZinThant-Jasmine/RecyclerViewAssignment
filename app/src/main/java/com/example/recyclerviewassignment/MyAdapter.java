package com.example.recyclerviewassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/*** This is Adapter ***/

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    //Step 3:We need to make a list of our movies:
    private List<Movie> movieList;

    //Step 4:Create a constructor:


    public MyAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.movie_row,viewGroup,false);



        // Step 5 :Here we want to initiate the layout inflater

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        // Step 6: Let's Bind our view with dataset:
        Movie movie = movieList.get(i);
        myViewHolder.title.setText(movie.getTitle());
        myViewHolder.genre.setText(movie.getGenre());
        myViewHolder.date.setText(movie.getDate());
    }

    @Override
    public int getItemCount() {


        //Step 7: Getting the right size of list
        return movieList.size();
    }

    /*** This is View Holder ***/

    public class MyViewHolder extends RecyclerView.ViewHolder{


        // This is an important class, where we want to define all our views
        //Step 1:Define TextViews:

        public TextView title,genre,date; // I pressed alt + enter

        //Step 2:Intializing our views
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_txt);
            genre =  itemView.findViewById(R.id.genre_txt);
            date = itemView.findViewById(R.id.date_txt);

        }
    }
}
