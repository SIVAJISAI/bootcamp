package com.tw.bootcamp.problem5;

import java.util.Objects;

public class Bag {
    private final Integer size = 12;
    private Integer ballCount = 0;
    public boolean addBall() {
        if(atMaxCapacity()){
            throw new BagFullException();
        }
        ballCount++;
        return  true;
    }

    private boolean atMaxCapacity() {
        return Objects.equals(ballCount, size);
    }
}
