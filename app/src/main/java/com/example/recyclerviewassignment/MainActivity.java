package com.example.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*** Let's configure our MainActivity ***/
    //Step 1: Define some variable

    private List<Movie> movieList= new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2: Initializing our views:
        recyclerView = findViewById(R.id.recyclerviewy);

        //Step 3:Initializing our Adapter
        myAdapter = new MyAdapter(movieList);

        //Step 4:Layout Manager Condfiguration
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        // Step 5:Binding recyclerView to Adapter:
        recyclerView.setAdapter(myAdapter);

        //Step 6: We need a mehtod that prepare our data
        //So this method will insert the data into our recyclerview via
        //       adapter class with the help of model class

        InsertData();

    }

    private void InsertData() {

        //Step 7 :Inserting Data:
        // Remeb=mber that we have 3 strings (texts)

        //We will use a model class to insert our data in correct form:

        /** These 2 lines are very important ,Since here will be adding  all data to be displayed
         * in order words, this is the best way to insert ur data via these 2 lines ***/

        Movie movie = new Movie("Soul","Life","2020");
        movieList.add(movie);

        //Let's create other items to display:

        movie = new Movie("Sweet Home","Horror","2020");
        movieList.add(movie);

        movie = new Movie("Gone with the wind","Life","1990");
        movieList.add(movie);

        movie = new Movie("Tamako Market","slice of life","2018");
        movieList.add(movie);

        //Step 8: Notify Adapter with data change:
        myAdapter.notifyDataSetChanged();

        //Step 9 : Let's run our app


    }
}