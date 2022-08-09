package me.thribs.reintegra.model;

public class Triangle {

    private double base;
    private double height;
    private final String color;

    public Triangle(String color) {
        this.base = 1;
        this.height = 1;
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + ", color=" + color + '}';
    }
    
}
