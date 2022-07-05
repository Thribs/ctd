public class Follower extends Person implements Observer {

        
    public Follower(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void receiveNotification(User sender) {
        System.out.println(getName() + " received notification from " + sender.getName());
    }
}
