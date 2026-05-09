package com.tw.bootcamp.problem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bag {
    private final Integer size = 12;
    private Integer ballCount = 0;
    private  final Map<BallColor,Integer> BallInventory = new HashMap<>();
    public boolean addBall(BallColor color) {
        if(atMaxCapacity()){
            throw new BagFullException();
        }

        Integer colorBallCount = BallInventory.getOrDefault(color,0) + 1;
        BallInventory.put(color,colorBallCount);
        ballCount = ballCount + 1;
        return  true;
    }

    private boolean atMaxCapacity() {
        return Objects.equals(ballCount, size);
    }


    public int getColoredBallCount(BallColor color) {
        return  BallInventory.getOrDefault(color,0);
    }
}
