class AdministrativeAssistant extends Assistant {
    private Shift shift;
    private Double nightlyBonus;

    public AdministrativeAssistant(String name, Double salary, String registrationNumber, Shift shift,
            Double nightlyBonus) {
        super(name, salary, registrationNumber);
        this.shift = shift;
        this.nightlyBonus = nightlyBonus;
    }

    @Override
    public Double getYearlySalary() {
        return (shift == Shift.NIGHT) ? (this.getSalary() + this.nightlyBonus) * 13 + nightlyBonus : super.getYearlySalary();
    }

    @Override
    public String toString() {
        return super.toString() + " " + shift + " " + nightlyBonus;
    }
}