package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

    private final Circle circle = new Circle(2);
    private final Circle circle2 = new Circle(3);

    @Test
    public void testPerimeter() {
        assertEquals(12.566370614359172, circle.perimeter(), 0.00001);
    }

    @Test
    public void testPerimeter2() {
        assertEquals(18.84955592153876, circle2.perimeter(), 0.00001);
    }
}
