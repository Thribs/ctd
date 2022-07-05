public class Main {
    public static void main(String[] args) {

        Auction astonAuction = new Auction(80, "Aston Martin DB9");
        Auction bmwAuction = new Auction(100, "BMW X6");
        Bidder john = new Bidder("John", "Doe", "12345", 60);
        Bidder jane = new Bidder("Jane", "Doe", "54321", 120);

        astonAuction.addObserver(john);
        astonAuction.addObserver(jane);
        bmwAuction.addObserver(john);
        bmwAuction.addObserver(jane);

        astonAuction.notifyObservers();
        bmwAuction.notifyObservers();
    }
    
}
