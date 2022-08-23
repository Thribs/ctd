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
    public static FileOutputStream outputStream = getFileOutputStream();
    public static ObjectOutputStream objectOutputStream = getObjectOutputStream();
    public static FileInputStream inputStream = getFileInputStream();
    public static ObjectInputStream objectInputStream = getObjectInputStream();

    public static void main(String[] args) {

        Contact john = new Contact("John", "john@gmail.com", "55544422233");
        Contact jane = new Contact("Jane", "jane@gmail.com", "55555533322");
        Contact jack = new Contact("Jack", "jack@gmail.com", "55555511133");
        Contact jill = new Contact("Jill", "jill@gmail.com", "55555500033");

        contacts.add(john);
        contacts.add(jane);
        contacts.add(jack);
        contacts.add(jill);

        writeObject(contacts);
        List<?> list = (List<?>) readObject();
        for (Object o : list) {
            contactsReadFromFile.add((Contact) o);
        }

        for (Contact contact : contactsReadFromFile) {
            System.out.println(contact);
        }
    }

    public static FileOutputStream getFileOutputStream() {
        try {
            return new FileOutputStream(CONTACTS_FILE_NAME);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static ObjectOutputStream getObjectOutputStream() {
        try {
            return new ObjectOutputStream(outputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static FileInputStream getFileInputStream() {
        try {
            return new FileInputStream(CONTACTS_FILE_NAME);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static ObjectInputStream getObjectInputStream() {
        try {
            return new ObjectInputStream(inputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeObject(Object o) {
        try {
            objectOutputStream.writeObject(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Object readObject() {
        try {
            return objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}