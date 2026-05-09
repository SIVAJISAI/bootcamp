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

    @Test
    void shouldAllowTheTwoRedBallsWhenOneGreenBallIsAdded() {
        Bag bag = new Bag();
        bag.addBall(BallColor.GREEN);
        bag.addBall(BallColor.RED);
        assertTrue(bag.addBall(BallColor.RED));
    }

    @Test
    void shouldThrowWhenAddingThreeRedBallsWhenOnlyOneGreenBallIsAdded() {
        Bag bag = new Bag();
        bag.addBall(BallColor.GREEN);
        bag.addBall(BallColor.RED);
        bag.addBall(BallColor.RED);
        assertThrows(MaxCapacityException.class,()->bag.addBall(BallColor.RED));
    }

    @Test
    void shouldAllowTwoYellowBallsWhenThereAreFiveBalls() {
        Bag bag = new Bag();
        bag.addBall(BallColor.GREEN);
        bag.addBall(BallColor.GREEN);
        bag.addBall(BallColor.RED);
        bag.addBall(BallColor.RED);
        bag.addBall(BallColor.RED);

        bag.addBall(BallColor.YELLOW);
        assertTrue(bag.addBall(BallColor.YELLOW));
    }

    @Test
    void shouldThrowWhenTheYellowBallCountWillBeMoreThanFortyPercentOfBallCount() {
        Bag bag = new Bag();
        assertThrows(MaxCapacityException.class,()->bag.addBall(BallColor.YELLOW));
    }
}
