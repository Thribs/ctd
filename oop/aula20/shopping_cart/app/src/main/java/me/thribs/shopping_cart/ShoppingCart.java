import java.util.List;

public class ShoppingCart {

    private List<Item> products;
    private ShoppingCartState state;

    public ShoppingCart(List<Item> products) {
        this.products = products;
        this.state = new Empty(this);
    }

    public List<Item> getProducts() {
        return products;
    }

    public void addProduct(Item item) {
        products.add(item);
    }

    public ShoppingCartState getState() {
        return state;
    }

    public void setState(ShoppingCartState state) {
        this.state = state;
    }

}
