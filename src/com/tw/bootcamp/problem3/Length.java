package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
    private static final double CM_FACTOR = 2.5;
    private static final int INCH_FACTOR = 12;
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    public static Length createInInches(double value) {
        if(value < 0){
            throw new negativeLengthException(value);
        }
        return new Length(value);
    }

    public static Length createInCm(double value) {
        double valueInInches = value / CM_FACTOR;
        return createInInches(valueInInches);
    }

    public static Length createInFt(double value) {
        double valueInInches = value * INCH_FACTOR;
        return createInInches(valueInInches);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return value == length.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public boolean isGreaterThan(Length l) {
        return this.value > l.value;
    }

    public boolean isLessThan(Length l) {
        return !isGreaterThan(l);
    }
}
