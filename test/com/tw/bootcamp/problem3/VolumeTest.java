package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
    @Test
    void sameValueAndSameUnitShouldBeEqual() {
        Volume oneLt = Volume.create(1,VolumeUnit.Lt);
        Volume anotherLT = Volume.create(1,VolumeUnit.Lt);
        assertEquals(oneLt,anotherLT);
    }


    @Test
    void twoSameQuantityInDifferentUnitShouldBeEqual() {
        Volume threeSeventyEightLt = Volume.create(378,VolumeUnit.Lt);
        Volume hundredGal = Volume.create(100,VolumeUnit.Gal);
        assertEquals(threeSeventyEightLt,hundredGal);
    }

    @Test
    void shouldNotBeEqualIfTheQuantityIsNotSame() {
        Volume twentyLt = Volume.create(20,VolumeUnit.Lt);
        Volume tenGal = Volume.create(10,VolumeUnit.Gal);
        assertNotEquals(tenGal,twentyLt);
    }
    @Test
    void shouldThrowIfTheValueIsNegative() {
        negativeValueException error = assertThrows(negativeValueException.class,()-> Volume.create(-1, VolumeUnit.Gal));
        assertEquals("-1.0 is a negative value", error.getMessage());
    }

}
