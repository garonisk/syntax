package org.example.init;

import org.example.model.Movie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoviesData {
    public static List<Movie> getMovies(){
        return Stream
                .of(new Movie(90),
                    new Movie(85),
                    new Movie(75),
                    new Movie(60),
                    new Movie(120),
                    new Movie(150),
                    new Movie(125))
        .collect(Collectors.toList());
    }
}
