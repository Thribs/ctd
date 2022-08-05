package me.thribs.thribs_flix;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Movie theShawshankRedemption = new Movie("The Shawshank Redemption", Country.BRAZIL);
        Movie theGodfather = new Movie("The Godfather", Country.ARGENTINA);
        Movie theGodfather2 = new Movie("The Godfather II", Country.ARGENTINA);
        Movie theDarkKnight = new Movie("The Dark Knight", Country.COLOMBIA);

        MoviesGrid moviesGrid = new MoviesGrid();
        moviesGrid.addMovies(List.of(theShawshankRedemption, theGodfather, theGodfather2, theDarkKnight));
        MoviesGridProxy proxy = new MoviesGridProxy(moviesGrid);

        IpAddress argentinaIp = new IpAddress("40", "255", "255", "255");
        IpAddress brazilIp = new IpAddress("80", "0", "0", "0");
        IpAddress colombiaIp = new IpAddress("120", "0", "0", "0");

        try {
            System.out.println(proxy.getMovieLink(theShawshankRedemption.getName(), brazilIp));
            System.out.println(proxy.getMovieLink(theGodfather.getName(), argentinaIp));
            System.out.println(proxy.getMovieLink(theGodfather2.getName(), argentinaIp));
            System.out.println(proxy.getMovieLink(theDarkKnight.getName(), colombiaIp));
            System.out.println(proxy.getMovieLink(theDarkKnight.getName(), brazilIp));

        } catch (MovieNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        Series friends = new Series("Friends");
        Series sopranos = new Series("Sopranos");
        Series breakingBad = new Series("Breaking Bad");
        Series theBigBangTheory = new Series("The Big Bang Theory");
        Series theWire = new Series("The Wire");
        Series theAmericans = new Series("The Americans");

        SeriesProxy seriesProxy = new SeriesProxy();

        try {
            System.out.println(seriesProxy.getSeriesLink(friends));
            System.out.println(seriesProxy.getSeriesLink(sopranos));
            System.out.println(seriesProxy.getSeriesLink(breakingBad));
            System.out.println(seriesProxy.getSeriesLink(theBigBangTheory));
            System.out.println(seriesProxy.getSeriesLink(theWire));
            System.out.println(seriesProxy.getSeriesLink(theAmericans));
        } catch (SeriesLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
