class Horse extends Animal {

    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    void talk() {
        System.out.println("Neigh!");
    }

    void gallop() {
        System.out.println("Galloping...");
    }
}