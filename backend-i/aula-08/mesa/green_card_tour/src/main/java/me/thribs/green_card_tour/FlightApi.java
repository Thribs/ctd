package me.thribs.green_card_tour;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class FlightApi {

    public static Map<String, Flight> flights = new HashMap<>();
    
    public static Flight getFlight(LocalDate departureDate, LocalDate arrivalDate, String departureAirportCity, String arrivalAirportCity) {
        
        return flights.get(departureDate + "-" + arrivalDate + "-" + departureAirportCity + "-" + arrivalAirportCity);
        
    }
    
}
