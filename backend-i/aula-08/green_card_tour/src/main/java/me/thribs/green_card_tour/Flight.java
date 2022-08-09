package me.thribs.green_card_tour;

import java.time.LocalDate;

public class Flight {
    
    private final LocalDate departureDate;
    private final LocalDate arrivalDate;
    private final String departureAirport;
    private final String arrivalAirport;

    public Flight(LocalDate departureDate, LocalDate arrivalDate, String departureAirport, String arrivalAirport) {
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }

}
