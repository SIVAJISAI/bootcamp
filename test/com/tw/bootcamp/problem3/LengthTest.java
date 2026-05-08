package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void twoEqualLengthInSameUnitsShouldBeEqual() {
        Length oneFeet = Length.createInFt(1);
        Length anotherOneFeet = Length.createInFt(1);
        assertEquals(oneFeet,anotherOneFeet);
    }

    @Test
    void twoEqualLengthsInFeetAndInchesUnitShouldBeEqual(){
        Length oneFeet = Length.createInFt(1);
        Length oneInch = Length.createInInches(12);
        assertEquals(oneFeet, oneInch);
    }

    @Test
    void twoInchShouldBeEqualToFiveCm() {
        Length twoInches = Length.createInInches(2);
        Length fiveCm = Length.createInCm(5);
        assertEquals(twoInches,fiveCm);
    }

    @Test
    void twoUnequalLengthsShouldNotBeEqual() {
        Length twoFeet = Length.createInFt(2);
        Length twoInches = Length.createInInches(2);
        assertNotEquals(twoInches, twoFeet);
    }
}
