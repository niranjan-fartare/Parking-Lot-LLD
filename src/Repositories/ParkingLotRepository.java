package Repositories;

import Exceptions.ParkingLotNotFoundException;
import Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parlingLotMap;
    private static Long idCounter = 0L;

    public ParkingLotRepository() {
        this.parlingLotMap = new HashMap<>();
    }

    public ParkingLot get(Long id) {
        ParkingLot parkingLot = parlingLotMap.get(id);
        if (parkingLot == null) {
            throw new ParkingLotNotFoundException();
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot) {
        parlingLotMap.put(++idCounter, parkingLot);
        System.out.println("Parking Lot added: " + parkingLot.getParkingLotName());
    }
}
