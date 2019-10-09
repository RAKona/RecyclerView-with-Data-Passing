package com.bitm.recycleviewdemo;

public class Movie {

    private String moviename;
    private String directorname;
    private int movieimage;

    public Movie() {
    }

    public Movie(String moviename, String directorname, int movieimage) {
        this.moviename = moviename;
        this.directorname = directorname;
        this.movieimage = movieimage;
    }

    public String getMoviename() {
        return moviename;
    }

    public String getDirectorname() {
        return directorname;
    }

    public int getMovieimage() {
        return movieimage;
    }




}
