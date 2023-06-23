package com.ltp.hellpspring;

public class Show {
    private String title;
    private String episode;
    private double rating;

    public Show(String t, String e, double r){
        title=t;
        episode=e;
        rating=r;
    }
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
