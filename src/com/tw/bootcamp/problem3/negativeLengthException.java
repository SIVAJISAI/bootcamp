package com.tw.bootcamp.problem3;

public class negativeLengthException extends IllegalArgumentException {
    public negativeLengthException(double value) {
        super(value + " is a negative value");

    }
}
