package Repositories;

import Exceptions.ParkingFloorNotFoundException;
import Models.Floor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Long, Floor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public Floor get(Long id) {
        Floor floor = parkingFloorMap.get(id);
        if (floor == null) {
            throw new ParkingFloorNotFoundException();
        }
        return floor;
    }

    public void put(Floor floor) {
        parkingFloorMap.put(floor.getId(), floor);
        System.out.println("Parking Floor added: " + floor.getId());
    }
}
