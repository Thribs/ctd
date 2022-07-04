import java.util.ArrayList;
import java.util.List;

public class Train extends Shape {

    private List<Shape> parts = new ArrayList<>();

    public Train(List<Shape> parts) {
        this.parts = parts;
    }

    @Override
    public double calculateArea() {
        double area = 0;
        for (Shape part : parts) {
            area += part.calculateArea();
        }
        return area;
    }
    
}
