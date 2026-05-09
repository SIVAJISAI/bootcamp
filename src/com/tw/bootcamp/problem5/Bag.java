package com.tw.bootcamp.problem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bag {
    private final Integer size = 12;
    private final int maxGreenBallCount = 3;
    private Integer ballCount = 0;


    private  final Map<BallColor,Integer> BallInventory = new HashMap<>();
    public boolean addBall(BallColor color) {
        if(atMaxBagCapacity() || atMaxColorCapacity(color) ){
            throw new MaxCapacityException();
        }

        Integer colorBallCount = BallInventory.getOrDefault(color,0) + 1;
        BallInventory.put(color,colorBallCount);
        ballCount = ballCount + 1;
        return  true;
    }

    private boolean atMaxColorCapacity(BallColor color) {
        int currentColorBallCount = getColoredBallCount(color);
        return  switch (color){
            case BLUE -> false;
            case GREEN -> currentColorBallCount== maxGreenBallCount;
            case RED -> currentColorBallCount ==  (getColoredBallCount(BallColor.GREEN) * 2);
            case YELLOW -> false;
        };
    }

    private boolean atMaxBagCapacity() {
        return Objects.equals(ballCount, size);
    }


    public int getColoredBallCount(BallColor color) {
        return  BallInventory.getOrDefault(color,0);
    }
}
