package Services.Strategies;

import Models.Spot;
import Models.Vehicle;

public interface SpotAllocationStrategy {
    Spot getParkingSpot(Vehicle vehicle);
}
