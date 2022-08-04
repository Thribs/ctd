package me.thribs.thribs_flix;

public class Series implements ISeries {

    private final String name;
    
    public Series(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getSeriesLink(String name) {
        return "https://www.thribs.me/series/" + name;
    }
    
}
