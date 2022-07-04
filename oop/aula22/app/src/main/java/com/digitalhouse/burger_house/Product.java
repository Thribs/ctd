public class Product extends Item {

    private final double price;
    

    public Product (String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
