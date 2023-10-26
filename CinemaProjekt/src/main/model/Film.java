package main.model;

import main.dao.IFilm;

import java.util.ArrayList;
import java.util.List;

public class Film implements IFilm {
    String movieName;
    int movieDuration;
    String movieGenre;
    String movieRating;
    String movieDescription;
    String movieLanguage;

    public Film(String movieName, int movieDuration, String movieGenre, String movieRating, String movieDescription, String movieLanguage) {
        this.movieName = movieName;
        this.movieDuration = movieDuration;
        this.movieGenre = movieGenre;
        this.movieRating = movieRating;
        this.movieDescription = movieDescription;
        this.movieLanguage = movieLanguage;
    }

    public Film(String movieName, int movieDuration) {
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }

    @Override
    public String getName() {
        return movieName;
    }

    @Override
    public void setName(String name) {
        this.movieName = name;
    }

    @Override
    public int getDuration() {
        return movieDuration;
    }

    @Override
    public void setDuration(int duration) {
        this.movieDuration = duration;
    }

    @Override
    public String getGenre() {
        return movieGenre;
    }

    @Override
    public void setGenre(String genre) {
        this.movieGenre = genre;
    }

    @Override
    public String getRating() {
        return movieRating;
    }

    @Override
    public void setRating(String rating) {
        this.movieRating = rating;
    }

    @Override
    public String getDescription() {
        return movieDescription;
    }

    @Override
    public void setDescription(String description) {
        this.movieDescription = description;
    }

    @Override
    public String getLanguage() {
        return movieLanguage;
    }

    @Override
    public void setLanguage(String language) {
        this.movieLanguage = language;
    }
}
