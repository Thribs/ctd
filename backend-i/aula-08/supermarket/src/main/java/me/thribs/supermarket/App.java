package me.thribs.supermarket;

import static me.thribs.supermarket.model.Card.*;
import static me.thribs.supermarket.model.Product.*;
import me.thribs.supermarket.model.Card;
import me.thribs.supermarket.model.Product;

public class App {

    public static void main(String[] args) {

        Card cardStarBank = new Card("123456789", BANK_STAR_BANK);
        Card cardHSBC = new Card("987654321", BANK_HSBC);
        Card cardSCB = new Card("111111111", BANK_SCB);
        Product cannedPeas = new Product("Canned Peas", CATEGORY_CANNED_GOODS);
        Product frozenPeas = new Product("Frozen Peas", CATEGORY_FROZEN_GOODS);
        Product dairyMilk = new Product("Dairy Milk", CATEGORY_DAIRY);
        Product beef = new Product("Beef", CATEGORY_MEAT);

        System.out.println("Discount for canned peas: " + DiscountFacade.getDiscount(cardStarBank, cannedPeas, 20));
        System.out.println("Discount for frozen peas: " + DiscountFacade.getDiscount(cardHSBC, frozenPeas, 10));
        System.out.println("Discount for frozen peas: " + DiscountFacade.getDiscount(cardStarBank, frozenPeas, 20));
        System.out.println("Discount for dairy milk: " + DiscountFacade.getDiscount(cardSCB, dairyMilk, 20));
        System.out.println("Discount for dairy milk: " + DiscountFacade.getDiscount(cardStarBank, dairyMilk, 20));
        System.out.println("Discount for beef: " + DiscountFacade.getDiscount(cardSCB, beef, 8));
        System.out.println("Discount for beef: " + DiscountFacade.getDiscount(cardStarBank, beef, 8));
        
    }
}