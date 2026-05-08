package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
    @Test
    void sameValueAndSameUnitShouldBeEqual() {
        Volume oneLt = Volume.create(1,VolumeUnit.Lt);
        Volume anotherLT = Volume.create(1,VolumeUnit.Lt);
        assertTrue(oneLt.equals(anotherLT));
    }


    @Test
    void twoSameQuantityInDifferentUnitShouldBeEqual() {
        Volume threeSeventyEightLt = Volume.create(378,VolumeUnit.Lt);
        Volume hundredGal = Volume.create(100,VolumeUnit.Gal);
        assertTrue(threeSeventyEightLt.equals(hundredGal));
    }

    @Test
    void shouldNotBeEqualIfTheQuantityIsNotSame() {
        Volume twentyLt = Volume.create(20,VolumeUnit.Lt);
        Volume tenGal = Volume.create(10,VolumeUnit.Gal);
        assertNotEquals(tenGal,twentyLt);
    }

    @Test
    void addingTwoVolumeQuantityShouldGiveTheResultInLts() {
        Volume oneLt = Volume.create(1,VolumeUnit.Lt);
        Volume oneGal = Volume.create(1,VolumeUnit.Gal);
        Volume fourPointSevenEightLt = Volume.create(4.78,VolumeUnit.Lt);
        assertTrue(fourPointSevenEightLt.equals(oneGal.add(oneLt)));
    }

    @Test
    void shouldThrowIfTheValueIsNegative() {
        negativeValueException error = assertThrows(negativeValueException.class,()-> Volume.create(-1, VolumeUnit.Gal));

        Volume v = Volume.create(1,VolumeUnit.Lt);
        Length l = Length.create(1,LengthUnit.In);
        assertEquals("-1.0 is a negative value", error.getMessage());
    }



}
