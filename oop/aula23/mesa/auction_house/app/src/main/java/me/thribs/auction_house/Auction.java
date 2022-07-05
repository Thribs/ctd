import java.util.ArrayList;
import java.util.List;

public class Auction implements Notifier {

    private List<Observer> observers = new ArrayList<Observer>();

    private double price;
    private String description;

    public Auction(double startingPrice, String description) {
        this.price = startingPrice;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);        
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);        
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.receiveNotification(this);
        }
    }
}