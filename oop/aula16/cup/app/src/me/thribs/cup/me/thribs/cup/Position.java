package me.thribs.cup;

public enum Position {
    GOAL_KEEPER("Goal keeper"), DEFENDER("Defender"), MIDFIELDER("Midfielder"), STRIKER("Striker");

    private final String description;

    Position(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
