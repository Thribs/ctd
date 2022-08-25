package me.thribs.vehicles.model;

public class Vehicle {
    
    private final String brand;
    private final String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Vehicle{ brand: " + this.brand + ", color: " + this.color + " }";
    }
    
}
