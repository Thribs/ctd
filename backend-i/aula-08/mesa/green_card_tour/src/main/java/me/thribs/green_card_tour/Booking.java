package me.thribs.green_card_tour;

import java.time.LocalDate;

public class Booking {
    
    private final LocalDate checkInDate;
    private final LocalDate checkOutDate;
    private final String city;

    public Booking(LocalDate checkInDate, LocalDate checkOutDate, String city) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.city = city;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", city='" + city + '\'' +
                '}';
    }

}
