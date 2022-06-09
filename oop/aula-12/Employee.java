abstract class Employee {
    protected String name;
    protected Double salary;
    
    public Employee(String name) {
        this.name = name;
    }

    public abstract void work();

    public String getName() {
        return name;
    }


}