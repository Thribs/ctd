package me.thribs.app;

public class HiredEmployee extends Employee {

    private double baseSalary;
    private double bonus;
    private double discount;

    public HiredEmployee(String firstName, String lastName, int accountNumber, double baseSalary, double bonus, double discount) {
        super(firstName, lastName, accountNumber);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.discount = discount;
    }

    @Override
    public double getPayment() {
        return baseSalary + bonus - discount;
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
