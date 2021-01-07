package com.example.recyclerviewassignment;

public class Movie {

    //display 3 strings in recycler view
    /****** This class is called: Model Class *****/

    private String title,genre,date;

    //Create constructor

    public Movie(String title, String genre, String date) {
        this.title = title;
        this.genre = genre;
        this.date = date;
    }

    //Create getter setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}
