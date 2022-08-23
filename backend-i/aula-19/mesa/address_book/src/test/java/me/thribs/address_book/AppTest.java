package me.thribs.address_book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import me.thribs.address_book.model.Contact;
import static me.thribs.address_book.App.contacts;
import static me.thribs.address_book.App.contactsReadFromFile;
import static me.thribs.address_book.App.writeObject;
import static me.thribs.address_book.App.readObject;

public class AppTest {

    @BeforeAll
    public static void setUp() {

        contacts = new ArrayList<>();

        Contact john = new Contact("John", "john@gmail.com", "55544422233");
        Contact jane = new Contact("Jane", "jane@gmail.com", "55555533322");
        Contact jack = new Contact("Jack", "jack@gmail.com", "55555511133");
        Contact jill = new Contact("Jill", "jill@gmail.com", "55555500033");

        contacts.add(john);
        contacts.add(jane);
        contacts.add(jack);
        contacts.add(jill);

    }

    @Test
    public void testWriteToFile() {
        writeObject(contacts);
        assertNotNull(readObject());
    }
    
    @Test
    public void testReadFromFile() {
        List<?> list = (List<?>) readObject();
        for (Object o : list) { contactsReadFromFile.add((Contact) o); }
        assertEquals(4, contactsReadFromFile.size());
    }   
}
