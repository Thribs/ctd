package me.thribs.app;

public class TempEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public TempEmployee(String firstName, String lastName, int accountNumber, double hourlyRate, double hoursWorked) {
        super(firstName, lastName, accountNumber);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPayment() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getReceipt(double amount) {
        return "Receipt for " + amount + " from " + this.firstName + " " + lastName + " account number " + accountNumber;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit of " + amount + " to " + this.firstName + " " + lastName + " account number " + accountNumber);
    }

}
