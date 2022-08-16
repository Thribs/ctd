package me.thribs.dental_practice.model;

public class Dentist {
    
    private final String name;
    private final String lastName;
    private final String registrationNumber;

    public Dentist(String name, String lastName, String registrationNumber) {
        this.name = name;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Dentist{" + "name=" + name + ", lastName=" + lastName + ", registrationNumber=" + registrationNumber + '}';
    }
}
