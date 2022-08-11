package me.thribs.logging;

import org.apache.log4j.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args) {
        
        logger.info("Hello, world");
        System.out.println("Hello, world");
        
    }
}