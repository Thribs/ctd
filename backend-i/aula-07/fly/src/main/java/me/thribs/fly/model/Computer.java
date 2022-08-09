package me.thribs.fly.model;

public class Computer {

    private final int id;
    private double hdSizeInMb;
    private double ramSizeInMb;
    private static int counter;

    public Computer(double hdSizeInGb, double ramSizeInGb) {
        super();
        this.hdSizeInMb = hdSizeInGb;
        this.ramSizeInMb = ramSizeInGb;
        this.id = counter++;
        System.out.println("Computer " + this.id + " created");
    }

    public int getId() {
        return id;
    }

    public double getHdSizeInMb() {
        return hdSizeInMb;
    }

    public void setHdSizeInMb(double hdSizeInMb) {
        this.hdSizeInMb = hdSizeInMb;
    }

    public double getRamSizeInMb() {
        return ramSizeInMb;
    }

    public void setRamSizeInMb(double ramSizeInMb) {
        this.ramSizeInMb = ramSizeInMb;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Computer [id=" + id + ", hdSizeInMb=" + hdSizeInMb + ", ramSizeInMb=" + ramSizeInMb + "]";
    }
    
}
