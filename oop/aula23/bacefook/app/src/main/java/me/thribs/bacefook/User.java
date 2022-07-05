import java.util.ArrayList;
import java.util.List;

public class User extends Person implements Publisher {

    private final List<Observer> observers = new ArrayList<>();

    public User(String name, String surname) {
        super(name, surname);
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
        for (Observer observer : observers) observer.receiveNotification(this);
    }

    public void publish() {
        System.out.println(getName() + " published");
        notifyObservers();
    }
    
}
