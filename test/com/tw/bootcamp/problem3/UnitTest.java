package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {

    @Test
    void shouldReturnMmTheConversionToBaseValueOfLength() {
        assertEquals(2,LengthUnit.Cm.convertToBase(5));
        assertEquals(2,LengthUnit.In.convertToBase(2));
        assertEquals(12,LengthUnit.Ft.convertToBase(1));
        assertEquals(1,LengthUnit.Mm.convertToBase(25));
    }
    void shouldReturnMmTheConversionToBaseValueOfVolume(){
        assertEquals(3.78, VolumeUnit.Gal.convertToBase(1));
        assertEquals(1, VolumeUnit.Gal.convertToBase(1));
    }
}
