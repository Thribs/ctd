package main.java.me.thribs.List;

import java.time.Period;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Person {
    private final String name;
    private final LocalDate birthday;
    private List<String> people = new ArrayList<>();

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<String> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        int nameLength = person.getName().length();
        int age = person.getAge();
        if (nameLength >= 5 && age >= 18) {
            people.add(person.getName());
            System.out.println("Added " + person.getName() + " to the list.");
        }
    }

    public int getAge() {
        int age = Period.between(birthday, LocalDate.now()).getYears();
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
