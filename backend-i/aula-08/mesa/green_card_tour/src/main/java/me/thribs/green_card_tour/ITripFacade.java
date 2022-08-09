package me.thribs.green_card_tour;

import java.time.LocalDate;

public interface ITripFacade {
    
    public String getTripPackage(LocalDate departureDate, LocalDate arrivalDate, String city);
}
