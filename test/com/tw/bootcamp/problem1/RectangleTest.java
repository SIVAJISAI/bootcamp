package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test void rectangleWithSameLengthAndBreadthShouldBeEqual(){
        Rectangle rectangle1 = new Rectangle(2,2);
        Rectangle rectangle2 = new Rectangle(2,2);
        assertEquals(rectangle2, rectangle1);
    }

    @Test
    void calculateAreaTest(){
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(4,rectangle.calculateArea());
    }

    @Test
    void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(8,rectangle.calculatePerimeter());

    }
}