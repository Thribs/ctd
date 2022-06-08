public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Sloth sloth = new Sloth("Sloth", 2);
        Dog dog = new Dog("Dog", 3);
        Horse horse = new Horse("Horse", 4);
        animals[0] = sloth;
        animals[1] = dog;
        animals[2] = horse;
        for (Animal animal : animals) {
            animal.talk();
        }
        sloth.climbTrees();
        dog.run();
        horse.gallop();
    }
}