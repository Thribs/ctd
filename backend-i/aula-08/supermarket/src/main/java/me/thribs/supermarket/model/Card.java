package me.thribs.supermarket.model;

public class Card {

    public static final String TYPE_CREDIT = "credit";
    public static final String TYPE_DEBIT = "debit";
    public static final String TYPE_PREPAID = "prepaid";
    public static final String BANK_STAR_BANK = "Star Bank";
    public static final String BANK_HSBC = "HSBC";
    public static final String BANK_SCB = "SCB";
    
    private final String cardNumber;
    private final String bank;

    public Card(String cardNumber, String bank) {
        this.cardNumber = cardNumber;
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "Card{" + "cardNumber=" + cardNumber + ", bank=" + bank + '}';
    }
}
