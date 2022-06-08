public class Worker {
    private String name;
    public Double wage;

    public Worker(String name, Double wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public String getWage() {
        return String.format("$%.2f", wage);
    }
}