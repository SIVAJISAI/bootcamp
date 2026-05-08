package com.tw.bootcamp.problem4;

import java.util.Objects;

public class ParkingLot {

    private int emptySpaces;

    public ParkingLot(int emptySpaces) {
        this.emptySpaces = emptySpaces;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingLot that = (ParkingLot) o;
        return emptySpaces == that.emptySpaces;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(emptySpaces);
    }

    public void park() {
        emptySpaces = emptySpaces - 1;
    }

}
