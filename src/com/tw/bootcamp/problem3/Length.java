package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    private Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length create(double value, LengthUnit unit) {
        if (value < 0) {
            throw new negativeValueException(value);
        }
        return new Length(value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Objects.equals(unit.convertToCommonBase(value), that.unit.convertToCommonBase(that.value));
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Length add(Length other) {
        double totalLength = unit.convertToCommonBase(value) + other.unit.convertToCommonBase(other.value);
        return create(totalLength, LengthUnit.In);
    }
}
