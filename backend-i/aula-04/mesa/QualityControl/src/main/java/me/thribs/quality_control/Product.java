package me.thribs.quality_control;

public class Product {

    private final String name;
    private final double weight;
    private final int lot;
    private final PackageCondition packageCondition;

    public Product(String name, double weight, int lot, PackageCondition packageCondition) {
        this.name = name;
        this.weight = weight;
        this.lot = lot;
        this.packageCondition = packageCondition;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getLot() {
        return lot;
    }

    public PackageCondition getPackageCondition() {
        return packageCondition;
    }    
    
}
