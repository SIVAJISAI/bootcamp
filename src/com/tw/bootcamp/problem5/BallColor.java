package com.tw.bootcamp.problem5;

public enum BallColor {
    BLUE(12),
    GREEN(3),
    RED(12),
    YELLOW(12);

    private final int maxLimit;

    BallColor(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    boolean isAtMaxLimit(int currentCount){
        return maxLimit==currentCount;
    }
}
