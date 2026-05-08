package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Temperature {
    private static final double TOLERANCE = 0.01;
    private final double value;
    private final TemperatureUnit unit;

    private Temperature(double value, TemperatureUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Temperature create(double value, TemperatureUnit unit) {
        if (value < 0) {
            throw new negativeValueException(value);
        }
        return new Temperature(value, unit);
    }

    public boolean equals(Temperature that) {
        if (that == null || getClass() != that.getClass()) return false;
        return Math.abs(unit.convertToBase(value) -  that.unit.convertToBase(that.value)) <= TOLERANCE;

    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}


