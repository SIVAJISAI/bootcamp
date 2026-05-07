package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class chanceTest {
    @Test
    void shouldRepresentTheChanceOfGettingTail() {
        Chance chanceOfGettingTail  = new Chance(0.5);
        Chance chance = new Chance(0.5);
        assertEquals(chance,chanceOfGettingTail);
    }
    @Test
    void shouldRepresentChanceOfNotGettingTail(){
        Chance chanceOfGettingTail  = new Chance(0.5);
        Chance chanceOfNotGettingTail = new Chance(0.5);
        assertEquals(chanceOfNotGettingTail,chanceOfGettingTail.not());
    }

    @Test
    void shouldRepresentChanceAtLeastOneTail(){
        Chance chanceOfGettingTail1 = new Chance(0.5);
        Chance chanceOfGettingTail2 = new Chance(0.5);
        Chance chanceOfGettingAtleastOneTail = chanceOfGettingTail1.union(chanceOfGettingTail2);
        Chance expectedChance = new Chance(0.75);
        assertEquals(expectedChance,chanceOfGettingAtleastOneTail);
    }

}
