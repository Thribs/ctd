package me.thribs.thribs_flix;

public class MovieNotAvailableException extends RuntimeException {
    public MovieNotAvailableException(String message) {
        super(message);
    }
}