abstract class Assistant extends Employee {
    private String registrationNumber;

    public Assistant(String name, Double salary, String registrationNumber) {
        super(name, salary);
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " " + registrationNumber;
    }
}