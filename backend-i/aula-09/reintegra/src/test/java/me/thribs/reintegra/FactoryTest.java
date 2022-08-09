package me.thribs.reintegra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import me.thribs.reintegra.model.Triangle;
import static me.thribs.reintegra.TriangleFactory.getTriangle;
import static me.thribs.reintegra.TriangleFactory.triangles;

public class FactoryTest {
    
    @Test
    void getTriangleTest(){

        Triangle triangle1, triangle2, triangle3;

        triangle1 = getTriangle("red");
        triangle1.setBase(2);
        triangle1.setHeight(3);
        triangle2 = getTriangle("red");
        triangle2.setBase(3);
        triangle2.setHeight(2.5);
        triangle3 = getTriangle("blue");
        triangle3.setBase(4);
        triangle3.setHeight(5);

        assertEquals(triangle1.getColor(), "red");
        assertEquals(triangle1.getArea(), 3.75);
        assertEquals(triangles.size(), 2);
    }

}
