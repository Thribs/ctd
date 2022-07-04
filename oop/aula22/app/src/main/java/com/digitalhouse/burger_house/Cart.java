import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items = new ArrayList<>();

    public Cart() {}

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItems(List<Item> items) {
        this.items.addAll(items);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.calculatePrice();
        }
        return totalPrice;
    }
}
