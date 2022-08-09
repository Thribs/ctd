package me.thribs.fly;

import me.thribs.fly.model.Computer;
import static me.thribs.fly.model.ComputerFactory.getComputer;

public class App {

    public static void main(String[] args) {

        Computer windowsAdmin = getComputer("windows", "admin", "admin");
        Computer windowsJohn = getComputer("windows", "john", "user");
        Computer macAdmin = getComputer("mac", "admin", "admin");
        Computer macJackie = getComputer("mac", "jackie", "user");
        Computer linuxAdmin = getComputer("linux", "admin", "admin");
        Computer linuxJane = getComputer("linux", "jane", "user");
        Computer linuxJaneDoe = getComputer("linux", "jane", "user");


        System.out.println(windowsAdmin.toString());
        System.out.println(windowsJohn.toString());
        System.out.println(macAdmin.toString());
        System.out.println(macJackie.toString());
        System.out.println(linuxAdmin.toString());
        System.out.println(linuxJane.toString());
        System.out.println(linuxJaneDoe.toString());

    }

    
}
