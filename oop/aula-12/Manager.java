class Manager extends Employee {
    private int bonus;

    public Manager(String name, int bonus) {
        super(name);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manager " + this.name + " is working");
    }    

}