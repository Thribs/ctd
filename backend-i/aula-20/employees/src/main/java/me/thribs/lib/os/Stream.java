package me.thribs.lib.os;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Stream {
    
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
