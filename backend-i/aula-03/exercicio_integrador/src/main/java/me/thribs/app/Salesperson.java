package main.java.me.thribs.app;

public abstract class Salesperson {

    private final String name;
    protected int sales = 0;

    public Salesperson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sell(int amount) {
        sales += amount;
    }

    public abstract int getScore();

    public String printRanking() {
        int score = getScore();
        boolean isRookie = score < 20;
        boolean isApprentice = score >= 20 && score <= 30;
        boolean isSenior = score > 30 && score <= 40;
        boolean isMaster = score > 40;
        if (isRookie) {
            return "Rookie";
        } else if (isApprentice) {
            return "Apprentice";
        } else if (isSenior) {
            return "Senior";
        } else if (isMaster) {
            return "Master";
        } else {
            return "Unknown";
        }
    }
    
}
