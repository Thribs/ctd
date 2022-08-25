package me.thribs.trainer.model;

public class Trainer {
    
    private final String name;

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Trainer{ name: " + name + "}";
    }
}
