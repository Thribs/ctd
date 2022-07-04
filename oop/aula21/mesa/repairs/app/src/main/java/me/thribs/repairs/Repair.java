public class Repair {
    private static String name;
    private double cost;
    private String address;
    private RepairState state;

    public Repair(String name) {
        this.state = new Budgeting(this);
        this.name = name;
        this.cost = 0;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setState(RepairState state) {
        this.state = state;
    }

}
