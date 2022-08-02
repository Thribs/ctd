package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

    private final Square square = new Square(2);
    private final Square square2 = new Square(3);

    @Test
    public void testPerimeter() {
        assertEquals(8, square.perimeter(), 0.00001);
    }

    @Test
    public void testPerimeter2() {
        assertEquals(12, square2.perimeter(), 0.00001);
    }
}
