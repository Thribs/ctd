package me.thribs.green_card_tour;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.time.LocalDate;

import static me.thribs.green_card_tour.FlightApi.flights;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static me.thribs.green_card_tour.BookingApi.bookings;
import static me.thribs.green_card_tour.TripFacade.getTripPackage;

public class TripsTest {
    
    private static Flight flight1, flight2, flight3;
    private static Booking booking1, booking2, booking3;

    @BeforeAll
    public static void setup() {

        Flight flight1 = new Flight(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 8), "Stockholm", "London");
        Flight flight2 = new Flight(LocalDate.of(2020, 1, 10), LocalDate.of(2020, 1, 15), "New York", "Dubai");
        Flight flight3 = new Flight(LocalDate.of(2020, 1, 20), LocalDate.of(2020, 1, 25), "Paris", "Rome");
        Booking booking1 = new Booking(LocalDate.of(2020, 1, 10), LocalDate.of(2020, 1, 20), "Dubai");
        Booking booking2 = new Booking(LocalDate.of(2020, 1, 10), LocalDate.of(2020, 1, 20), "Rome");
        Booking booking3 = new Booking(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 8, 20), "London");

        flights.put("2020-01-01-2020-01-08-Stockholm-London", flight1);
        flights.put("2020-01-10-2020-01-15-New York-Dubai", flight2);
        flights.put("2020-01-20-2020-01-25-Paris-Rome", flight3);
        bookings.put("2020-01-10-2020-01-20-Dubai", booking1);
        bookings.put("2020-01-10-2020-01-20-Rome", booking2);
        bookings.put("2020-01-01-2020-08-20-London", booking3);
    }

    @Test
    public void getTripPackageTest(){

        assertNotNull(getTripPackage(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 20), "London"));
        assertNotNull(getTripPackage(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 20), "Rome"));
        assertNotNull(getTripPackage(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 20), "Dubai"));
        
    }

    
}
