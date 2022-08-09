package me.thribs.supermarket;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.thribs.supermarket.model.Card;
import me.thribs.supermarket.model.Product;

public class DiscountFacadeTest {

    private Card card;
    private Product product;

    @BeforeEach
    public void setUp() {
        card = new Card("123456789", "Star Bank");
        product = new Product("Canned peas", Product.CATEGORY_CANNED_GOODS);
    }

    @Test
    public void testGetDiscount() {
        assertEquals(0.45, DiscountFacade.getDiscount(card, product, 20));
    }
    
}
