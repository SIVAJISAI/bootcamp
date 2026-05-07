package com.tw.bootcamp.problem1;

import java.util.Objects;

public class Rectangle {
    private final int length;
    private final int breadth;

    public static Rectangle createRectangle(int length, int breadth) {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(int side){
        return  createRectangle(side,side);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && breadth == rectangle.breadth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, breadth);
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double calculateArea() {
        return length * breadth;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
