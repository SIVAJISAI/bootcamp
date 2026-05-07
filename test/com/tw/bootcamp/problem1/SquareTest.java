package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void twoSquaresWithSameSideLengthShouldBeEqual() {
        Square square1 = new Square(2);
        Square square2 = new Square(2);
        assertEquals(square1,square2);

    }

    @Test
    void calculateAreaTest() {
        Square square = new Square(2);
        assertEquals(4,square.calculateArea());
    }
    @Test
    void calculatePerimeterTest() {
        Square square = new Square(2);
        assertEquals(8,square.calculatePerimeter());
    }
}
