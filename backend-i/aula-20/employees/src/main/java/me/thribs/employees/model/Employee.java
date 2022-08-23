package me.thribs.employees.model;

public class Employee {
    
    private final String firstName;
    private final String lastName;
    private final String idNumber;
    private final double salary;

    public Employee(String firstName, String lastName, String idNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.salary = salary;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getIdNumber() { return idNumber; }
    public double getSalary() { return salary; }
    @Override
    public String toString() { return "Employee{" + firstName + ", " + lastName + "}"; }
}
