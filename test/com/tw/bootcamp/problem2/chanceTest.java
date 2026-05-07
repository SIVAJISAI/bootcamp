package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class chanceTest {
    @Test
    void shouldRepresentTheChanceOfGettingTail() {
        Chance chanceOfGettingTail  = new Chance(0.5);
        assertEquals(new Chance(0.5),chanceOfGettingTail);
    }
    @Test
    void shouldRepresentChanceOfNotGettingTail(){
        Chance chanceOfGettingTail  = new Chance(0.5);
        assertEquals( new Chance(0.5),chanceOfGettingTail.not());
    }

    @Test
    void shouldRepresentChanceAtLeastOneTail(){
        Chance chanceOfGettingTail1 = new Chance(0.5);
        Chance chanceOfGettingAtleastOneTail = chanceOfGettingTail1.union(new Chance(0.5));
        assertEquals( new Chance(0.75),chanceOfGettingAtleastOneTail);
    }

    @Test
    void shouldRepresentChanceOfGettingTailsOnBoth(){
        Chance chanceOfGettingTail1 = new Chance(0.5);
        Chance chanceOfGettingBothTails = chanceOfGettingTail1.and(new Chance(0.5));
        assertEquals(new Chance(0.25),chanceOfGettingBothTails);
    }

    @Test
    void shouldRepresentTheChanceOfGettingThreeOnDice(){
        Chance chanceOfGettingThree  = new Chance(0.166);
        assertEquals(new Chance(0.166),chanceOfGettingThree);
    }
}
