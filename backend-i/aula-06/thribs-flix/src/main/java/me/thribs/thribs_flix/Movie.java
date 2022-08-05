package me.thribs.thribs_flix;

public class Movie {
    
    private final String name;
    private final Country countryOfOrigin;
    private final String link;

    public Movie(String name, Country countryOfOrigin) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.link = "https://www.thribs.me/" + name;
    }

    public String getName() {
        return name;
    }

    public Country getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getLink() {
        return link;
    }
}
