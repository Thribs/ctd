public class Bidder implements Observer {
    private String name;
    private String surname;
    private String id;
    private double maxBid;

    public Bidder(String name, String surname, String id, double maxBid) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.maxBid = maxBid;
    }

    public String getName() {
        return name + " " + surname;
    }

    public String getId() {
        return id;
    }

    public double getMaxBid() {
        return maxBid;
    }
    

    @Override
    public void receiveNotification(Auction auction) {
        System.out.println("Leilão" + auction.getDescription() + "de valor " + auction.getPrice());
        if (auction.getPrice() <= maxBid) {
            System.out.println(getName() + " propõe um lance de " + getMaxBid() + "para o leilão " + auction.getDescription());
        }
    }
    
}
