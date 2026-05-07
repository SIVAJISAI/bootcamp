package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test void rectangleWithSameLengthAndBreadthShouldBeEqual(){
        Rectangle rectangle1 = Rectangle.createRectangle(2,2);
        Rectangle rectangle2 = Rectangle.createRectangle(2,2);
        assertEquals(rectangle2, rectangle1);
    }

    @Test
    void calculateRectangleAreaTest(){
        Rectangle rectangle = Rectangle.createRectangle(2,2);
        assertEquals(4,rectangle.calculateArea());
    }

    @Test
    void calculateRectanglePerimeterTest() {
        Rectangle rectangle = Rectangle.createRectangle(2,2);
        assertEquals(8,rectangle.calculatePerimeter());

    }
    @Test
    void calculateSquareAreaTest() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(4,square.calculateArea());
    }
    @Test
    void calculateSquarePerimeterTest() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(8,square.calculatePerimeter());
    }
}