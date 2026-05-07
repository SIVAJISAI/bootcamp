package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateAreaTest(){
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(4,rectangle.calculateArea());
    }

}