package main.java.me.thribs.enterprise;

public class EmployeeFactory {
    private static EmployeeFactory instance = new EmployeeFactory();

    private EmployeeFactory() {}

    public Employee newEmployee(String name, String type) {
        switch (type) {
            case Employee.HOURLY:
                return new HourlyEmployee(name);
            case Employee.MONTHLY:
                return new MonthlyEmployee(name);
            default:
                throw new IllegalArgumentException("Invalid employee type");
        }
    }
}
