package me.thribs.supermarket;

public class AmountApi {

    public static double getDiscount(int amount) {
        if (amount > 11) {
            return 0.15;
    }
        return 0.0;
    }
    
}
