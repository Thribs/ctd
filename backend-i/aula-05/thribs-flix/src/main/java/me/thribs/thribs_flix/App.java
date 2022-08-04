package me.thribs.thribs_flix;

public class App {
    public static void main(String[] args) {

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
        }
        catch (SeriesLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
