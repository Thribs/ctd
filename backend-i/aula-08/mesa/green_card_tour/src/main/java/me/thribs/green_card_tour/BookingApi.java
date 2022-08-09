package me.thribs.green_card_tour;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class BookingApi {
    
    public static Map<String, Booking> bookings = new HashMap<>();

    public static Booking getBooking(LocalDate checkinDate, LocalDate checkoutDate, String city) {
        return bookings.get(checkinDate + "-" + checkoutDate + "-" + city);
    }
    
}
