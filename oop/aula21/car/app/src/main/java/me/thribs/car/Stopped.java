package app.src.main.java.me.thribs.car;

public class Stopped implements CarState {

    private Car car;


    public Stopped(Car car) {
        this.car = car;
    }

    @Override
    public void startStop(Car car) {
        car.setState(new Running(car));
    }
}