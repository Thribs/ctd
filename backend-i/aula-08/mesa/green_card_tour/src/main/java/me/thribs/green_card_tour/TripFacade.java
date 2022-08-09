package me.thribs.green_card_tour;

import java.time.LocalDate;
import java.util.Random;

import static me.thribs.green_card_tour.FlightApi.flights;

public class TripFacade {
    
    public static String getTripPackage(LocalDate departureDate, LocalDate arrivalDate, String city) {

        Random random = new Random();
        // get random flight
        Object[] flightsArray = flights.values().toArray();
        Flight flight = (Flight) flightsArray[random.nextInt(flightsArray.length)];
        // get random booking
        Object[] bookingsArray = BookingApi.bookings.values().toArray();
        Booking booking = (Booking) bookingsArray[random.nextInt(bookingsArray.length)];

        return "Trip Package: " + flight.toString() + " " + booking.toString();
    }
    
}
