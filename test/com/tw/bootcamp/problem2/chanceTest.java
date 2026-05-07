package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class chanceTest {
    @Test
    void shouldRepresentTheChanceOfGettingTail() {
        Chance chanceOfGettingTail  = Chance.create(0.5);
        assertEquals(Chance.create(0.5),chanceOfGettingTail);
    }
    @Test
    void shouldRepresentChanceOfNotGettingTail(){
        Chance chanceOfGettingTail  = Chance.create(0.5);
        assertEquals(Chance.create(0.5),chanceOfGettingTail.not());
    }

    @Test
    void shouldRepresentChanceAtLeastOneTail(){
        Chance chanceOfGettingTail1 = Chance.create(0.5);
        Chance chanceOfGettingAtleastOneTail = chanceOfGettingTail1.union(Chance.create(0.5));
        assertEquals(Chance.create(0.75),chanceOfGettingAtleastOneTail);
    }

    @Test
    void shouldRepresentChanceOfGettingTailsOnBoth(){
        Chance chanceOfGettingTail1 = Chance.create(0.5);
        Chance chanceOfGettingBothTails = chanceOfGettingTail1.and(Chance.create(0.5));
        assertEquals(Chance.create(0.25),chanceOfGettingBothTails);
    }

    @Test
    void shouldRepresentTheChanceOfGettingThreeOnDice(){
        Chance chanceOfGettingThree  = Chance.create(0.166);
        assertEquals(Chance.create(0.166),chanceOfGettingThree);
    }

    @Test
    void ShouldThrowIfTheChanceIsNotValid(){
        assertThrows(IllegalArgumentException.class,()-> Chance.create(-0.55));
        assertThrows(IllegalArgumentException.class,()-> Chance.create(2.55));
    }
}
