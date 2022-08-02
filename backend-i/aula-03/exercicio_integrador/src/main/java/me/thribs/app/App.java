package main.java.me.thribs.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Salesperson> salespeople = new ArrayList<>();
        Employee john = new Employee("John", LocalDate.of(2021, 1, 1));
        Employee jane = new Employee("Jane", LocalDate.of(2020, 10, 1));
        Affiliate jim = new Affiliate("Jim");
        Affiliate jessy = new Affiliate("Jessy");
        Affiliate jimmy = new Affiliate("Jimmy");
        john.addAffiliate(jim);
        john.addAffiliate(jessy);
        jane.addAffiliate(jimmy);
        john.sell(3);
        jane.sell(2);
        jim.sell(2);
        jessy.sell(1);
        jimmy.sell(20);

        salespeople.addAll(List.of(john, jane, jim, jessy, jimmy));

        for (Salesperson salesperson : salespeople) {
            System.out.println(salesperson.getName() + " - " + salesperson.printRanking() + ": " + salesperson.getScore());
        }
    }
}