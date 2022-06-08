public class Heater {
    protected Integer numberOfBurners;
    protected Double calories = 0.0;

    public Heater(Integer numberOfBurners) {
        this.numberOfBurners = numberOfBurners;
    }

    public void calculateCalories() {
        this.calories = this.numberOfBurners * 0.5;
    }
}