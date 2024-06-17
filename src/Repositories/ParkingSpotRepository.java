package Repositories;

import Exceptions.ParkingSpotNotFoundException;
import Models.Spot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Long, Spot> spotMap;

    public ParkingSpotRepository() {
        this.spotMap = new HashMap<>();
    }

    public Spot getTicket(Long id) {
        Spot spot = spotMap.get(id);
        if (spot == null) {
            throw new ParkingSpotNotFoundException();
        }
        return spot;
    }

    public void put(Spot spot) {
        spotMap.put(spot.getId(), spot);
        System.out.println("Parking Spot added: " + spot.getId());
    }
}
