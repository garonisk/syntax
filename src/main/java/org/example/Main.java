package org.example;

import org.example.init.MoviesData;
import org.example.model.Flight;

import java.util.List;

public class Main {
    public static void main(String[] args) {



        Flight flight = new Flight(250);

        List <Integer> movies = flight.getEligibleMoviesDuration(flight.getFlightDuration(),MoviesData.getMovies());

        System.out.println(movies);
    }
}