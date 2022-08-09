package me.thribs.supermarket;

import me.thribs.supermarket.model.Card;
import me.thribs.supermarket.model.Product;

public class DiscountFacade implements IDiscountFacade {

    public static double getDiscount(Card card, Product product, int amount) {

        return CardApi.getDiscount(card) + ProductApi.getDiscount(product) + AmountApi.getDiscount(amount);    

    }

}
