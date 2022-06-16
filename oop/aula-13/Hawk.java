public class Hawk extends Animal implements FlyingAnimal {

    @Override
    public void makeSound() {
        System.out.println("Hawk: Chirp chirp");
    }

    @Override
    public void fly() {
        System.out.println("Hawk: I'm flying!");
    }

}
