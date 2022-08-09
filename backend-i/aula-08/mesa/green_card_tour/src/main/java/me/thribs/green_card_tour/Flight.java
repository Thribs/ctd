package me.thribs.green_card_tour;

import java.time.LocalDate;

public class Flight {
    
    private final LocalDate departureDate;
    private final LocalDate arrivalDate;
    private final String departureAirportCity;
    private final String arrivalAirportCity;

    public Flight(LocalDate departureDate, LocalDate arrivalDate, String departureAirportCity, String arrivalAirportCity) {
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureAirportCity = departureAirportCity;
        this.arrivalAirportCity = arrivalAirportCity;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public String getDepartureAirport() {
        return departureAirportCity;
    }

    public String getArrivalAirport() {
        return arrivalAirportCity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", departureAirport='" + departureAirportCity + '\'' +
                ", arrivalAirport='" + arrivalAirportCity + '\'' +
                '}';
    }

}
