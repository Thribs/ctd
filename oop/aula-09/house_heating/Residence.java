public class Residence {
    private Integer numberOfInhabitants;
    private Double area;
    private Double insulation = 0.0;
    private Heater[] heaters;
    private Double temperature = 0.0;

    public Residence(Integer numberOfInhabitants, Double area, Heater[] heaters) {
        this.numberOfInhabitants = numberOfInhabitants;
        this.area = area;
        this.heaters = heaters;
    }
     public void calculateInsulation() {
         // Copilot messed this up. Fix it
        for (Heater heater : heaters) {
            heater.calculateCalories();
            this.insulation += heater.calories;
        }

     }
     public void calculateTemperature() {
        this.temperature = this.insulation / this.area;
     }
}