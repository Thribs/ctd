package me.thribs.reintegra;

import java.util.HashMap;
import java.util.Map;

import me.thribs.reintegra.model.Triangle;

public class TriangleFactory {
    
    public static final Map<String, Triangle> triangles = new HashMap<>();

    public static Triangle getTriangle(String color) {
        
        Triangle triangle = triangles.get(color);

        if (triangle == null) {
            triangle = new Triangle(color);
            triangles.put(color, triangle);
        }

        return triangle;
    }
}
