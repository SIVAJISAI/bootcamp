package com.tw.bootcamp.problem1;

import java.util.Objects;

public class Rectangle {
    private final int length;
    private final int breadth;

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

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
