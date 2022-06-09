class Salesperson extends Employee {
    private int sales;
    private int commission;

    public Salesperson(String name, int sales, int commission) {
        super(name);
        this.sales = sales;
        this.commission = commission;
    }

    @Override
    public void work() {
        System.out.println("Salesperson " + this.name + " is working");
    }
}