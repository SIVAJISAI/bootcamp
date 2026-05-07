package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {
    @Test
    void gettingTailProbabilityTest() {
        double probability = Coin.getProbabilityOfGettingTail();
        assertEquals(0.5, probability);
    }
}
