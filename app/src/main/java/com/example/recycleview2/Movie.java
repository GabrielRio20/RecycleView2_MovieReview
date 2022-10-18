package com.example.recycleview2;

public class Movie {
    String title;
    String director;
    String review;
    int image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Movie() {
        this.title = title;
        this.director = director;
        this.review = review;
        this.image = image;
    }
}
