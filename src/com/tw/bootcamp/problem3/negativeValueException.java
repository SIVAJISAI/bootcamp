package com.tw.bootcamp.problem3;

public class negativeValueException extends IllegalArgumentException {
    public negativeValueException(double value) {
        super(value + " is a negative value");

    }
}
