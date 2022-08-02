package main.java.me.thribs.List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<Person> people = new ArrayList<>();

    @BeforeEach
    void doBefore(){
        p1 = new Person("John", LocalDate.of(1990, 1, 1));
        p2 = new Person("Jane", LocalDate.of(1990, 1, 1));
        p3 = new Person("Jim", LocalDate.of(2007, 1, 1));
        p4 = new Person("Jack", LocalDate.of(2009, 1, 1));
        p5 = new Person("Joe", LocalDate.of(2010, 1, 1));
        p6 = new Person("Jill", LocalDate.of(2008, 1, 1));
        p7 = new Person("Juniper", LocalDate.of(1990, 1, 1));
        p8 = new Person("Jenny", LocalDate.of(2015, 1, 1));
        p9 = new Person("Juan", LocalDate.of(2010, 1, 1));
        p10 = new Person("Juanita", LocalDate.of(1990, 1, 1));
    }

    @Test
    void addToList() {
        p1.addPerson(p1);
        p2.addPerson(p2);
        p3.addPerson(p3);
        p4.addPerson(p4);
        p5.addPerson(p5);
        p6.addPerson(p6);
        p7.addPerson(p7);
        p8.addPerson(p8);
        p9.addPerson(p9);
        p10.addPerson(p10);
    }

    @Test 
    void printList() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    
    
}
