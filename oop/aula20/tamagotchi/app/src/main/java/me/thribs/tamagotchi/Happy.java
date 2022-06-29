public class Happy implements TamagotchiState {

    private Tamagotchi tamagotchi;
    
    public Happy(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
    
    @Override
    public void feed() {
        tamagotchi.setState(TamagotchiState.SAD);
    }
    
    @Override
    public void sleep() {
        tamagotchi.setState(TamagotchiState.SLEEPY);
    }
    
    @Override
    public void play() {
        tamagotchi.setState(TamagotchiState.HUNGRY);
    }

    @Override
    public void die() {
        tamagotchi.setState(TamagotchiState.DEAD);
    }
    
}
