class Sloth extends Animal {
    
    public Sloth(String name, int age) {
        super(name, age);
    }

    @Override
    void talk() {
        System.out.println("Sloth says: \"Sloth!\"");
    }

    void climbTrees() {
        System.out.println("Climbing trees...");
    }
}