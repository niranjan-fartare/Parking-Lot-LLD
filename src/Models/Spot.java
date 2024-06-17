package Models;

import Models.enums.SpotStatus;
import Models.enums.VehicleType;

public class Spot extends BaseModel {
    private int spotNumber;
    private SpotStatus spotStatus;
    private Vehicle vehicle;
    private VehicleType vehicleType;

    public Spot(){
    }

    public Spot(int spotNumber, SpotStatus spotStatus, Vehicle vehicle, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.spotStatus = spotStatus;
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
