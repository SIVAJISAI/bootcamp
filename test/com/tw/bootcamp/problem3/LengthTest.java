package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void twoEqualLengthInSameUnitsShouldBeEqual() {
        Length oneFeet = Length.create(1, LengthUnit.Ft);
        Length anotherOneFeet = Length.create(1, LengthUnit.Ft);
        assertEquals(oneFeet, anotherOneFeet);
    }

    @Test
    void twoEqualLengthsInFeetAndInchesUnitShouldBeEqual() {
        Length oneFeet = Length.create(1, LengthUnit.Ft);
        Length oneInch = Length.create(12, LengthUnit.In);
        assertEquals(oneFeet, oneInch);
    }

    @Test
    void twoInchShouldBeEqualToFiveCm() {
        Length twoInches = Length.create(2, LengthUnit.In);
        Length fiveCm = Length.create(5, LengthUnit.Cm);
        assertEquals(twoInches, fiveCm);
    }

    @Test
    void twoUnequalLengthsShouldNotBeEqual() {
        Length twoFeet = Length.create(2, LengthUnit.Ft);
        Length twoInches = Length.create(2, LengthUnit.In);
        assertNotEquals(twoInches, twoFeet);
    }


    @Test
    void shouldThrowIfTheValueIsNegative() {
        negativeValueException error = assertThrows(negativeValueException.class,()-> Length.create(-1, LengthUnit.In));
        assertEquals("-1.0 is a negative value", error.getMessage());
    }

    @Test
    void addingTwoLengthsShouldGiveTheResult() {

        Length oneInch = Length.create(1,LengthUnit.In);
        Length twoInch = Length.create(2,LengthUnit.In);
        Length threeInch = Length.create(3,LengthUnit.In);
        assertEquals(threeInch, twoInch.add(oneInch));
    }
    @Test
    void addingTwoLengthInDifferentUnitShouldReturnTheResultInInches() {

        Length twoPointFiveCm = Length.create(2.5,LengthUnit.Cm);
        Length twoInch = Length.create(2,LengthUnit.In);
        Length threeInch = Length.create(3,LengthUnit.In);
        assertEquals(threeInch, twoInch.add(twoPointFiveCm));
    }
}
