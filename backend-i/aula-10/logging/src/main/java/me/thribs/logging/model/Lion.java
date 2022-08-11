package me.thribs.logging.model;

import org.apache.log4j.Logger;

public class Lion {

    public static Logger logger = Logger.getLogger(Lion.class);
    
    private final String name;
    private int age;
    private boolean isAlpha;

    public Lion(String name, int age, boolean isAlpha) {
        this.name = name;
        this.age = age;
        this.isAlpha = isAlpha;
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

    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean isAlpha) {
        this.isAlpha = isAlpha;
    }

    public void run() {
        logger.info("Lion " + name + " is running");
    }
}
