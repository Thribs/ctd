package main.java.me.thribs.app;

public class Affiliate extends Salesperson {

    public Affiliate(String name) {
        super(name);
    }
    
    @Override
    public int getScore() {
        int score = 0;
        score += this.sales * 15;
        return score;
    }
}
