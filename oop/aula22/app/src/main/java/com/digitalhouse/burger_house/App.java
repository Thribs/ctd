import java.util.List;

public class App {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product soda = new Product("Refri", 7.5);
        Product fries = new Product("Fritas", 4.98);
        Product burger = new Product("Hamburguer", 8.75);

        Combo combo = new Combo("Happy Meal");
        combo.addProduct(soda);
        combo.addProducts(List.of(fries, burger));

        cart.addItem(combo);
        cart.addItem(soda);

        System.out.println(cart.calculateTotalPrice()); 
    }
}