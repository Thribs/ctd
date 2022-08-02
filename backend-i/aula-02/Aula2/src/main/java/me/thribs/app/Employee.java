package me.thribs.app;

public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected int accountNumber;

    public Employee(String firstName, String lastName, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }


    public abstract double getPayment();

    public abstract String getReceipt(double amount);

    public abstract void deposit(double amount);
    
}