package me.thribs.thribs_flix;

public class MoviesGridProxy {

    private MoviesGrid moviesGrid;

    public MoviesGridProxy(MoviesGrid moviesGrid) {
        this.moviesGrid = moviesGrid;
    }

    public String getMovieLink(String name, IpAddress ipAddress) {

        Movie movie = moviesGrid.getMovie(name);
        Country countryOfOrigin = ipAddress.getCountryOfOrigin();
        if (movie.getCountryOfOrigin() != countryOfOrigin) {
            throw new MovieNotAvailableException("Filme não disponível para o país");
        }
        return movie.getLink();
    }
}
