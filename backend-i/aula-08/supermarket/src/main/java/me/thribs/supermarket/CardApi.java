package me.thribs.supermarket;

import me.thribs.supermarket.model.Card;

public class CardApi {
    
    public static double getDiscount(Card card) {

        if (card.getBank().equals(Card.BANK_STAR_BANK)) {
            return 0.2;
        }
        return 0.0;        
    }
}
