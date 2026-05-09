package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Map;

public class ParkingAttendant {

    private final Map<Integer, ParkingLot> parkingLots = new HashMap<>();
    private int nextParkingId;

    public ParkingAttendant() {
        this.nextParkingId = 1;
    }

    public static ParkingAttendant createParkingDeck() {

        return new ParkingAttendant();
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

    public boolean isParkingLotFull(Integer parkingLotId) {
        ParkingLot parkingLot = parkingLots.get(parkingLotId);
        if(parkingLot == null){
            throw  new IllegalArgumentException(parkingLotId + " not validId");
        }
        return parkingLot.isFull();
    }
}
