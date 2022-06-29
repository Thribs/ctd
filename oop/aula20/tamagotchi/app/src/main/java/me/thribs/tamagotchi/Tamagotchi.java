public class Tamagotchi {
    private TamagotchiState state;

    public Tamagotchi() {
        this.state = TamagotchiState.HAPPY;
    }

    public void setState(TamagotchiState state) {
        this.state = state;
    }

    public void feed() {
        state.feed();
    }
}
