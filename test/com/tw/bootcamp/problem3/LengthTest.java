package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void twoEqualLengthInSameUnitsShouldBeEqual() {
        Length oneFeet = Length.createInFt(1);
        Length anotherOneFeet = Length.createInFt(1);
        assertEquals(oneFeet, anotherOneFeet);
    }

    @Test
    void twoEqualLengthsInFeetAndInchesUnitShouldBeEqual() {
        Length oneFeet = Length.createInFt(1);
        Length oneInch = Length.createInInches(12);
        assertEquals(oneFeet, oneInch);
    }

    @Test
    void twoInchShouldBeEqualToFiveCm() {
        Length twoInches = Length.createInInches(2);
        Length fiveCm = Length.createInCm(5);
        assertEquals(twoInches, fiveCm);
    }

    @Test
    void twoUnequalLengthsShouldNotBeEqual() {
        Length twoFeet = Length.createInFt(2);
        Length twoInches = Length.createInInches(2);
        assertNotEquals(twoInches, twoFeet);
    }

    @Test
    void shouldReturnTrueIfValueIsGreaterThanOther() {
        Length threeInches = Length.createInInches(3);
        Length fiveCm = Length.createInCm(5);
        assertTrue(threeInches.isGreaterThan(fiveCm));
    }

    @Test
    void shouldReturnTrueIfValueIsLessThanOther() {
        Length threeInches = Length.createInInches(3);
        Length fiveCm = Length.createInCm(5);
        assertTrue(fiveCm.isLessThan(threeInches));
    }

    @Test
    void shouldThrowIfTheValueIsNegative() {
        negativeLengthException error = assertThrows(negativeLengthException.class,()->Length.createInInches(-1));
        assertEquals("-1.0 is a negative value", error.getMessage());
    }
}
