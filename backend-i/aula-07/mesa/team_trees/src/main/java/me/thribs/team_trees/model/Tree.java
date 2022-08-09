package me.thribs.team_trees.model;

public class Tree {

    public static String COLOR_GREEN = "green";
    public static String COLOR_RED = "red";
    public static String COLOR_BLUE = "blue";
    public static String TYPE_ORNAMENTAL = "ornamental";
    public static String TYPE_FRUIT_BEARING = "fruit bearing";
    public static String TYPE_FLOWERING = "flowering";

    private int id;
    private double height;
    private int age;
    private String color;
    private static int counter = 0;

    public Tree(double height, int age, String color) {
        this.height = height;
        this.age = age;
        this.color = color;
        this.id = counter++;        
    }

    @Override
    public String toString() {
        return "Tree [id=" + id + ", height=" + height + ", age=" + age + ", color=" + color + "]";
    }
}