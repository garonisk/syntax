package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Flight {
    private int flightDuration;
    private Movie movie;
    private Movie movie1;
    private Movie movie2;

    HashMap<Movie, Integer> map = new HashMap<>();

    int properDurationOfFlight = flightDuration - 30 ;

    public Flight(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public List<Integer> getEligibleMoviesDuration(int flightDuration , List<Movie> movies) {
        int max = 0;
        ArrayList<Integer> moviesList = new ArrayList<>();
        for (int i = 0; i < movies.size() - 1; i++) {
            movie1 = movies.get(i);
            movie2 = movies.get(i + 1);
            if ((properDurationOfFlight - calculateDistance(movie1, movie2)) > max) {
                if ((properDurationOfFlight - calculateDistance(movie1, movie2)) > 0) {
                    max = properDurationOfFlight - calculateDistance(movie1, movie2);
                    moviesList.add(movies.indexOf(i));
                    moviesList.add(movies.indexOf(i + 1));
                }
            }
        }
        return moviesList;
    }
    protected int calculateDistance(Movie movie1,Movie movie2){
            int distance1 = movie1.getDuration();
            int distance2 = movie2.getDuration();
            return distance1+distance2;



    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightDuration=" + flightDuration +
                ", movie=" + movie +
                ", movie1=" + movie1 +
                ", movie2=" + movie2 +
                ", map=" + map +
                ", properDurationOfFlight=" + properDurationOfFlight +
                '}';
    }
}
