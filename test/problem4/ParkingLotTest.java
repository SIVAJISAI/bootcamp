package problem4;

import com.tw.bootcamp.problem4.ParkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {

    @Test
    void twoParkingLotWithSimilarVacantSpacesShouldBeEqual() {

        ParkingLot parkingLot = new ParkingLot(10);
        ParkingLot parkingLot1 = new ParkingLot(10);
        assertEquals(parkingLot1,parkingLot);
    }

    @Test
    void parkingCarShouldReduceTheNumberOfRemainingSpaces(){
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.park();
        ParkingLot parkingLot1 = new ParkingLot(9);
        assertEquals(parkingLot1,parkingLot);
    }
    
}
