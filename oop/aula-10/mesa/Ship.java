public class Ship extends Object {
    
    private Double speed;
    private Integer healthPoints;
    
    public Ship(int xPosition, int yPosition, Direction direction, double speed, int healthPoints) {
        super(xPosition, yPosition, direction);
        this.speed = speed;
        this.healthPoints = healthPoints;
    }

    @Override
    public void goTo(int x, int y, Direction direction) {
        int newX = x + speed.intValue();
        int newY = y + speed.intValue();
        super.goTo(newX, newY, direction);
    }

    public void rotate(Direction direction) {
        super.setDirection(direction);
    }
    
}