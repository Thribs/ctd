package me.thribs.thribs_flix;

public class SeriesProxy {
    
    private int weeklySeriesCount = 0;

    public SeriesProxy() {

    }

    public String getSeriesLink(Series series) {

        if(weeklySeriesCount < 5) {

            weeklySeriesCount++;
            return series.getSeriesLink(series.getName());

        }
        else { throw new SeriesLimitExceededException("Limite de reproduções excedido"); }
    }
}
