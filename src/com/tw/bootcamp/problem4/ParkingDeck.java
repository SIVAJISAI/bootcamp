package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Map;

public class ParkingDeck {

    private final Map<Integer, ParkingLot> parkingLots = new HashMap<>();
    private int nextParkingId;

    public ParkingDeck() {
        this.nextParkingId = 1;
    }

    public static ParkingDeck createParkingDeck() {
        return new ParkingDeck();
    }


    public int add(ParkingLot parkingLot) {
        parkingLots.put(nextParkingId, parkingLot);
        return nextParkingId++;

    }

    public boolean parkVehicle(Integer parkingLotId) {
        ParkingLot parkingLot = parkingLots.get(parkingLotId);
        if(parkingLot == null){
            throw  new IllegalArgumentException(parkingLotId + " not validId");
        }
        return parkingLot.park();
    }
}
