package me.thribs.dogs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import me.thribs.dogs.model.Dog;

public class App {

    public static final String DOGS_FILE_NAME = "dogs.bin";
    
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        Dog toby = new Dog("Toby", 2);
        Dog lassie = new Dog("Lassie", 5);
        Dog bob = new Dog("Bob", 1);
        Dog clifford = new Dog("Clifford", 2);

        dogs.add(toby);
        dogs.add(lassie);
        dogs.add(bob);
        dogs.add(clifford);

        FileOutputStream outFile;
        ObjectOutputStream out;

        try {
            outFile = new FileOutputStream(DOGS_FILE_NAME);
            out = new ObjectOutputStream(outFile);
            out.writeObject(dogs);
            out.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        List<Dog> dogsReadFromFile = new ArrayList<Dog>();

        FileInputStream inFile;
        ObjectInputStream in;

        try {
            inFile = new FileInputStream(DOGS_FILE_NAME);
            in = new ObjectInputStream(inFile);
            List<?> list = (List<?>) in.readObject();
            for (Object o : list) { dogsReadFromFile.add((Dog) o); }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (Dog dog :dogsReadFromFile) {
            System.out.println(dog.toString());
        }
    }
}
