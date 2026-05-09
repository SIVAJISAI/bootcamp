package problem4;

import com.tw.bootcamp.problem4.ParkingDeck;
import com.tw.bootcamp.problem4.ParkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingDeckTest {
    @Test
    void shouldAddTheParkingLotToParkingDeckAndShouldReturnIdOfAddedParkingLot() {

        ParkingDeck parkingDeck = ParkingDeck.createParkingDeck();
        ParkingLot parkingLot = new ParkingLot(10);
        assertEquals(1,parkingDeck.add(parkingLot));
    }

    @Test
    void shouldBeAbleToParkinASpecificParkingLot() {
        ParkingDeck parkingDeck = ParkingDeck.createParkingDeck();
        ParkingLot parkingLot = new ParkingLot(10);
        Integer parkingLotId = parkingDeck.add(parkingLot);
        assertTrue(parkingDeck.parkVehicle(parkingLotId));
    }

    @Test
    void shouldThrowIfTheParkingLotIdIsNotValid() {
        ParkingDeck parkingDeck = ParkingDeck.createParkingDeck();
        IllegalArgumentException error = assertThrows(IllegalArgumentException.class,()->parkingDeck.parkVehicle(1));
        assertEquals("1 not validId",error.getMessage());
    }

    @Test
    void shouldBeAbleToCheckIfAParkingLotIsFullOrNot() {
        ParkingDeck parkingDeck = ParkingDeck.createParkingDeck();
        ParkingLot parkingLot = new ParkingLot(10);


    }
}
