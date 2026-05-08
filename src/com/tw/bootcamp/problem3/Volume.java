package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Volume {
    private final double value;
    private final VolumeUnit unit;

    private Volume(double value , VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }
    public static Volume create(double value, VolumeUnit unit){
        if(value < 0){
            throw new negativeValueException(value);
        }
        return  new Volume(value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume that = (Volume) o;
        return Objects.equals(unit.convertToBase(value), that.unit.convertToBase(that.value));

    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
