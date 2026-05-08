package com.tw.bootcamp.problem4;

import java.util.Objects;

public class ParkingLot {

    private int emptySpaces;

    public ParkingLot(int emptySpaces) {
        this.emptySpaces = emptySpaces;
    }



    public boolean park() {
        if(isFull()){
            return false;
        }
        emptySpaces = emptySpaces - 1;
        return  true;
    }

    public boolean isFull() {
        return  emptySpaces == 0;
    }
}
