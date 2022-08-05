package me.thribs.thribs_flix;

import java.util.ArrayList;
import java.util.List;

public class MoviesGrid implements IMoviesGrid {

    private List<Movie> movies = new ArrayList<>();
    
    @Override
    public Movie getMovie(String name) {

        return getMovieByName(name);        
    }


    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addMovies(List<Movie> movies) {
        this.movies.addAll(movies);
    }

    public Movie getMovieByName(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        throw new MovieNotFoundException("Filme não encontrado");
    }
    
}
