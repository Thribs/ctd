package main.java.me.thribs.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee extends Salesperson {

    private final LocalDate hireDate;
    private List<Affiliate> affiliates = new ArrayList<>();

    public Employee(String name, LocalDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void addAffiliate(Affiliate affiliate) {
        affiliates.add(affiliate);
    }

    @Override
    public int getScore() {
        int score = 0;
        LocalDate today = LocalDate.now();
        int years = today.getYear() - hireDate.getYear();
        score += affiliates.size() * 10;
        score += sales * 5;
        score += years * 5;
        return score;
    }
}
