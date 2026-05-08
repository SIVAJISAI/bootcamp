package com.tw.bootcamp.problem4;

public class ParkingLot {

    private int emptySpaces;

    public ParkingLot(int emptySpaces) {
        this.emptySpaces = emptySpaces;
    }



    public boolean park() {
        if(isFull()){
            throw  new ParkingIsFullException();
        }
        emptySpaces = emptySpaces - 1;
        return  true;
    }

    public boolean isFull() {
        return  emptySpaces == 0;
    }
}
