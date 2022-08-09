package me.thribs.fly.model;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static final String COMPUTER_TYPE_WINDOWS = "windows";
    private static final String COMPUTER_TYPE_LINUX = "linux";
    private static final String COMPUTER_TYPE_MAC = "mac";
    
    private static Map<String, Computer> computers = new HashMap<>();

    public static Computer getComputer(String type, String user, String privilege) {
        double hdSizeInGb = 0;
        double ramSizeInGb = 0;

        switch(type) {
            case COMPUTER_TYPE_WINDOWS:
               hdSizeInGb = 128;
                ramSizeInGb = 16;
                break;
            case COMPUTER_TYPE_MAC:
                hdSizeInGb = 500;
                ramSizeInGb = 8;
                break;
            case COMPUTER_TYPE_LINUX:
                hdSizeInGb = 1000;
                ramSizeInGb = 32;
                break;
            default:
                throw new IllegalArgumentException("Unknown computer type: " + type);
        }
        String specs = "HD: " + hdSizeInGb + " GB; RAM: " + ramSizeInGb + " GB" + "; User: " + user + "; Privilege: " + privilege;
        Computer computer = computers.get(specs);
        if (computer == null) {
            computer = new Computer(hdSizeInGb, ramSizeInGb);
            computers.put(specs, computer);
        }
        return computer;
    }
}
