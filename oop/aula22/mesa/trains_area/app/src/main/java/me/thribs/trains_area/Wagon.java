import java.util.ArrayList;
import java.util.List;

public class Wagon extends Shape {

    private List<Shape> shapes = new ArrayList<>();

    public Wagon(List<Shape> shapes) {
        this.shapes = shapes;
    }


    @Override
    public double calculateArea() {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }
}
