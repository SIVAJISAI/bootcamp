package com.tw.bootcamp.problem4;

import com.tw.bootcamp.problem4.ParkingAttendant;
import com.tw.bootcamp.problem4.ParkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingAttendentTest {
    @Test
    void shouldAddTheParkingLotToParkingDeckAndShouldReturnIdOfAddedParkingLot() {

        ParkingAttendant parkingAttendent = ParkingAttendant.createParkingDeck();
        ParkingLot parkingLot = new ParkingLot(10);
        assertEquals(1, parkingAttendent.add(parkingLot));
    }

    @Test
    void shouldBeAbleToParkinASpecificParkingLot() {
        ParkingAttendant parkingAttendent = ParkingAttendant.createParkingDeck();
        ParkingLot parkingLot = new ParkingLot(10);
        Integer parkingLotId = parkingAttendent.add(parkingLot);
        assertTrue(parkingAttendent.parkVehicle(parkingLotId));
    }

    @Test
    void shouldThrowIfTheParkingLotIdIsNotValid() {
        ParkingAttendant parkingAttendent = ParkingAttendant.createParkingDeck();
        IllegalArgumentException error = assertThrows(IllegalArgumentException.class,()-> parkingAttendent.parkVehicle(1));
        assertEquals("1 not validId",error.getMessage());
    }

    @Test
    void shouldBeAbleToCheckIfAParkingLotIsFullOrNot() {
        ParkingAttendant parkingAttendent = ParkingAttendant.createParkingDeck();
        ParkingLot parkingLot = new ParkingLot(10);
        Integer parkingLotId = parkingAttendent.add(parkingLot);
        assertFalse(parkingAttendent.isParkingLotFull(parkingLotId));

    }
    @Test
    void shouldReturnTrueIfAParkingLotIsFull() {
        ParkingAttendant parkingAttendent = ParkingAttendant.createParkingDeck();
        ParkingLot parkingLot = new ParkingLot(0);
        Integer parkingLotId = parkingAttendent.add(parkingLot);
        assertTrue(parkingAttendent.isParkingLotFull(parkingLotId));

    }
}
