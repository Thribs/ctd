public class Object {
    private Integer xPosition;
    private Integer yPosition;
    private Direction direction;

    public Object(int xPosition, int yPosition, Direction direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public void goTo(int x, int y, Direction direction) {
        this.xPosition = x;
        this.yPosition = y;
        this.direction = direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}