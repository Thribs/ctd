package me.thribs.cup;

public enum Escalation {
    STARTING("Starting player"), SUBSTITUTE("Substitute player"), BENCH("Bench player");

    private final String description;

    Escalation(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
