class TechnicalAssistant extends Assistant {
    private Double bonus;

    public TechnicalAssistant(String name, Double salary, String registrationNumber, Double bonus) {
        super(name, salary, registrationNumber);
        this.bonus = bonus;
    }

    @Override
    public Double getYearlySalary() {
        return super.getYearlySalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " " + bonus;
    }
}