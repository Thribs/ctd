package me.thribs.dental_clinic.model;

public class Address {
     
    private final int id;
    private final String street;
    private final int number;
    private final String city;
    private final String neighborhood;

    public Address(int id, String street, int number, String city, String neighborhood) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
        this.neighborhood = neighborhood;
    }

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", street=" + street + ", number=" + number + ", city=" + city + ", neighborhood=" + neighborhood + '}';
    }
    
}
