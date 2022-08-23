package me.thribs.address_book.model;

import java.io.Serializable;

public class Contact implements Serializable {
    
    private final String name;
    private final String emailAddress;
    private final String phoneNumber;

    public Contact(String name, String emailAddress, String phoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "Address{" + "name:'" + name + '\'' + ", emailAddress:'" + emailAddress + '\'' + ", phoneNumber: '" + this.phoneNumber + '\'' + '}';
    }

}