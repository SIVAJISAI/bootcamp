package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BagTest {

    @Test
    void shouldAddTheBallToTheBag() {
        Bag bag = new Bag();
        assertTrue(bag.addBall());
    }

    @Test
    void shouldNotAllowToFurtherAddBallIntoTheBag() {

    }
}
