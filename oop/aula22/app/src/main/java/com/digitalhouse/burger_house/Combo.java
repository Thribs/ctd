import java.util.ArrayList;
import java.util.List;

public class Combo extends Item {

    private final List<Product> products = new ArrayList<>();

    public Combo(String name) {
        super(name);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    @Override
    public double calculatePrice() {
        double price = 0;
        for (Product product : products) {
            price += product.calculatePrice();
        }
        return price;
    }    
}
