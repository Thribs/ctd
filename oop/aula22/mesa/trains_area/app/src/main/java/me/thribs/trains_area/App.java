import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Circle wagonWheel = new Circle(1);
        Rectangle wagonBody = new Rectangle(5, 4);

        Wagon wagon = new Wagon(List.of(wagonWheel, wagonWheel, wagonBody));

        Circle locomotiveWheel = new Circle(1);
        Rectangle locomotiveBody = new Rectangle(6, 4);
        Triangle locomotiveNose = new Triangle(2,2);

        Locomotive locomotive = new Locomotive(List.of(locomotiveWheel, locomotiveWheel, locomotiveBody, locomotiveNose));

        Train train = new Train(List.of(wagon, locomotive));

        System.out.println(train.calculateArea());

    }
}