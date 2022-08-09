package me.thribs.supermarket.model;

public class Product {

    public static final String CATEGORY_CANNED_GOODS = "canned goods";
    public static final String CATEGORY_FROZEN_GOODS = "frozen goods";
    public static final String CATEGORY_DAIRY = "dairy";
    public static final String CATEGORY_MEAT = "meat";
    
    private final String name;
    private final String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" + "name:" + name + ", category:" + category + '}';
    }
}
