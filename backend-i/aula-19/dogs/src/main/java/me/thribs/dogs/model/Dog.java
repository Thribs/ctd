package me.thribs.dogs.model;

import java.io.Serializable;

public class Dog implements Serializable {

    private final String name;
    private int ageInYears;

    public Dog(String name, int ageInYears) {
        this.name = name;
        this.ageInYears = ageInYears;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAgeInYears() {
        return this.ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    @Override
    public String toString() {
        return "Dog{" + name + "," + ageInYears + "}";
    }
}
