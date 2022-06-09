class Secretary extends Employee {
    public Secretary(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Secretary " + this.name + " is working");
    }
}