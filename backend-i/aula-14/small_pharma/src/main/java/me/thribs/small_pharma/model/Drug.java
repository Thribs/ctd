package me.thribs.small_pharma.model;

public class Drug {

    private final int id;
    private final String name;
    private final String labName;
    private int quantityInStock;
    private double price;

    public Drug(int id, String name, String labName, int quantityInStock, double price) {
        this.id = id;
        this.name = name;
        this.labName = labName;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }

    public Drug(String name, String labName, int quantityInStock, double price) {
        this.id = -1;
        this.name = name;
        this.labName = labName;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLabName() {
        return labName;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drug{" + "id=" + id + ", name=" + name + ", labName=" + labName + ", quantityInStock=" + quantityInStock + ", price=" + price + '}';
    }
    
}
