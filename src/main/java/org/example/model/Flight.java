package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Flight {
    private static int flightDuration;
    private Movie movie;
    private static Movie movie1;
    private static Movie movie2;




    public Flight(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public static List<Integer> getEligibleMoviesDuration(int flightDuration , List<Movie> movies) {
        int properDurationOfFlight = flightDuration - 30 ;
        int max = -1;
        int tempIndex = -1;
        int tempIndex2 = -1;
        for (int i = 0; i < movies.size(); i++) {
            movie1 = movies.get(i);
            for (int j = 1; j < movies.size() ; j++) {
                movie2 = movies.get(j);
                int calculation = movie1.getDuration() + movie2.getDuration();
               if ((calculation <= properDurationOfFlight)
                && (calculation > max)){
                        max = calculation;
                        tempIndex = i;
                        tempIndex2 = j;
                    }
                }
          }

        return Arrays.asList(tempIndex,tempIndex2);
    }
    }

