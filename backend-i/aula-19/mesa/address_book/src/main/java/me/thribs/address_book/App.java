package me.thribs.address_book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import me.thribs.address_book.model.Contact;

public class App {

    public static final String CONTACTS_FILE_NAME = "contacts.bin";
    public static List<Contact> contacts = new ArrayList<Contact>();
    public static List<Contact> contactsReadFromFile = new ArrayList<Contact>();
    public static FileOutputStream fileOutputStream = getFileOutputStream(CONTACTS_FILE_NAME);
    public static ObjectOutputStream objectOutputStream = getObjectOutputStream(fileOutputStream);
    public static FileInputStream fileInputStream = getFileInputStream(CONTACTS_FILE_NAME);
    public static ObjectInputStream objectInputStream = getObjectInputStream(fileInputStream);

    public static void main(String[] args) {

        Contact john = new Contact("John", "john@gmail.com", "55544422233");
        Contact jane = new Contact("Jane", "jane@gmail.com", "55555533322");
        Contact jack = new Contact("Jack", "jack@gmail.com", "55555511133");
        Contact jill = new Contact("Jill", "jill@gmail.com", "55555500033");

        contacts.add(john);
        contacts.add(jane);
        contacts.add(jack);
        contacts.add(jill);

        writeObject(contacts, objectOutputStream);
        List<?> list = (List<?>) readObject(objectInputStream);
        for (Object o : list) {
            contactsReadFromFile.add((Contact) o);
        }

        for (Contact contact : contactsReadFromFile) {
            System.out.println(contact);
        }
    }

    public static FileOutputStream getFileOutputStream(String fileName) {
        try {
            return new FileOutputStream(fileName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ObjectOutputStream getObjectOutputStream(FileOutputStream fileStream) {
        try {
            return new ObjectOutputStream(fileStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static FileInputStream getFileInputStream(String fileName) {
        try {
            return new FileInputStream(fileName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ObjectInputStream getObjectInputStream(FileInputStream fileStream) {
        try {
            return new ObjectInputStream(fileStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeObject(Object o, ObjectOutputStream outputStream) {
        try {
            outputStream.writeObject(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object readObject(ObjectInputStream inputStream) {
        try {
            return inputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}