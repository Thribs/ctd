class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void talk() {
        System.out.println("Woof!");
        
    }

    void run() {
        System.out.println("Running...");
    }
    
}