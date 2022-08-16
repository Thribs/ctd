package me.thribs.transactions.model;

public class Account {

    private final int id;
    private final String name;
    private final String accountNumber;
    private double balance = 0;

    public Account(int id, String name, String accountNumber, double balance) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
