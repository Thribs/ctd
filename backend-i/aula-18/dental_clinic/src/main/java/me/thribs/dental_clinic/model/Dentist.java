package me.thribs.dental_clinic.model;

public class Dentist {
    
    private Integer id = null;
    private final String firstName;
    private final String lastName;
    private final String registrationNumber;

    public Dentist(String firstName, String lastName, String registrationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
    }

    public Integer getId() {
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

    @Override
    public String toString() {
        return "Dentist{" + "id=" + id + ", name=" + firstName + ", lastName=" + lastName + ", registrationNumber=" + registrationNumber + '}';
    }
}
