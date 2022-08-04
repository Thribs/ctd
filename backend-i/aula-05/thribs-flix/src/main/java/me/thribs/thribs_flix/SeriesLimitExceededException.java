package me.thribs.thribs_flix;

public class SeriesLimitExceededException extends RuntimeException {
    
    public SeriesLimitExceededException(String message) {
        super(message);
    }
}