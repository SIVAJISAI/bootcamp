package problem4;

import com.tw.bootcamp.problem4.ParkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {


    @Test
    void shouldReturnTrueIfParkedSuccessfully(){
        ParkingLot parkingLot = new ParkingLot(10);
        assertTrue(parkingLot.park());
    }

    @Test
    void shouldReturnFalseIfParkingWasUnsuccessful() {
        ParkingLot parkingLot = new ParkingLot(0);
        assertFalse(parkingLot.park());

    }

    @Test
    void shouldReturnTrueIfParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        assertTrue(parkingLot.isFull());
    }

    @Test
    void shouldReturnFalseIfParkingIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        assertFalse(parkingLot.isFull());
    }
}
