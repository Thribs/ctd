package me.thribs.green_card_tour;

import java.time.LocalDate;

import static me.thribs.green_card_tour.FlightApi.flights;
import static me.thribs.green_card_tour.BookingApi.bookings;

public class App {
        
        public static void main(String[] args) {

            TripFacade tripsFacade = new TripFacade();

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

            System.out.println(tripsFacade.getTripPackage(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 20), "London"));
            System.out.println(tripsFacade.getTripPackage(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 20), "Rome"));
            System.out.println(tripsFacade.getTripPackage(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 20), "Dubai"));
        }
    
}