public abstract class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }
}
