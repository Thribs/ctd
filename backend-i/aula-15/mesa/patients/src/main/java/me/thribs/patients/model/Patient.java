package me.thribs.patients.model;

import java.time.LocalDate;

public class Patient {

    private final int id;
    private final String firstName;
    private final String lastName;
    private final String registrationNumber;
    private final LocalDate registrationData;
    private final Address address;

    public Patient(int id, String firstName, String lastName, String registrationNumber, LocalDate registrationData, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
        this.registrationData = registrationData;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public LocalDate getRegistrationData() {
        return registrationData;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", registrationNumber=" + registrationNumber + ", registrationData=" + registrationData + ", address=" + address + '}';
    }
    
}
