abstract class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double raise) {
        this.salary += raise;
    }

    public Double getYearlySalary() {
        return salary * 13;
    }

    public String toString() {
        return name + " " + salary + " " + getYearlySalary();
    }
}