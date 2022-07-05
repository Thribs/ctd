public class App {
    public static void main(String[] args) {
        User user = new User("John", "Smith");
        Follower follower = new Follower("Jane", "Doe");
        
        user.addObserver(follower);
        user.publish();
    }    
}
