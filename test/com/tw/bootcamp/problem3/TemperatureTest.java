package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {

    @Test
    void twoEqualQuantityShouldBeEqual() {
    Temperature hundredCelsius = Temperature.create(100,TemperatureUnit.C);
    Temperature twoHundredTwelveFarenhite = Temperature.create(212,TemperatureUnit.F);
    assertTrue(hundredCelsius.equals(twoHundredTwelveFarenhite));
    }

    @Test
    void twoUnequalQuantityShouldBeUnequal() {
        Temperature oneCelsius = Temperature.create(1,TemperatureUnit.C);
        Temperature oneFaranhite = Temperature.create(1,TemperatureUnit.F);
        assertFalse(oneFaranhite.equals(oneCelsius));
    }
}
