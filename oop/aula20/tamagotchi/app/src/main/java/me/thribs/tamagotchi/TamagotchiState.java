public interface TamagotchiState {

    public static final TamagotchiState HAPPY = new Happy();
    public static final TamagotchiState HUNGRY = new Hungry();
    public static final TamagotchiState SAD = new Sad();
    public static final TamagotchiState SLEEPY = new Sleepy();
    public static final TamagotchiState DEAD = new Dead();
    
    public void feed();
    public void play();
    public void sleep();
    public void die();
}
