public class HourlyWorker extends Worker {
    private Double hourlyWage;

    public HourlyWorker(String name, Double wage, Double hourlyWage) {
        super(name, wage);
        this.hourlyWage = hourlyWage;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public String getWage(Double hours) {
        return String.format("$%.2f", this.getWage() + hours * hourlyWage);
    }
}