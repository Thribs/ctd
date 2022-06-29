public class Dead implements TamagotchiState {

    private Tamagotchi tamagotchi;
    
    public Dead(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
    
    @Override
    public void feed() {
        tamagotchi.setState(TamagotchiState.HAPPY);
    }

    @Override
    public void play() {
        tamagotchi.setState(TamagotchiState.HAPPY);
    }

    @Override
    public void sleep() {
        tamagotchi.setState(TamagotchiState.HAPPY);
    }

    @Override
    public void die() {
        tamagotchi.setState(TamagotchiState.DEAD);
    }

}
