package me.thribs.logging.model;

import org.apache.log4j.Logger;

public class Tiger {

    public static Logger logger = Logger.getLogger(Tiger.class);
    
    private final String name;
    private int age;

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
        logger.info("Tiger " + name + " is running");
    }
}
