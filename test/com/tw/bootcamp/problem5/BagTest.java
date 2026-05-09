package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {

    @Test
    void shouldAddTheBallToTheBag() {
        Bag bag = new Bag();
        assertTrue(bag.addBall(BallColor.BLUE));
    }

    @Test
    void shouldNotAllowToFurtherAddBallIntoTheBag() {
        Bag bag = new Bag();
        for(int i = 0 ; i <= 11; i++){
            bag.addBall(BallColor.BLUE);
        }
        assertThrows(MaxCapacityException.class,()->bag.addBall(BallColor.BLUE));
    }


    @Test
    void shouldOrganizeTheBallsAccordingToColor() {
        Bag bag = new Bag();
        bag.addBall(BallColor.BLUE);
        bag.addBall(BallColor.BLUE);
        assertEquals(2,bag.getColoredBallCount(BallColor.BLUE));
    }

    @Test
    void shouldNotAddMoreGreenBallIfAtMaxGreenCapacity() {
        Bag bag = new Bag();
        bag.addBall(BallColor.GREEN);
        bag.addBall(BallColor.GREEN);
        bag.addBall(BallColor.GREEN);
        assertThrows(MaxCapacityException.class,()->bag.addBall(BallColor.GREEN));
    }
}
