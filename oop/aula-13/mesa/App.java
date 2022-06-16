public class App {
    public static void main(String[] args) {
        // create a light robot, a tank, and a bait and print them
        LightRobot lightRobot = new LightRobot();
        Tank tank = new Tank();
        Bait bait = new Bait();
        lightRobot.print();
        tank.print();
        bait.print();
    }    
}
