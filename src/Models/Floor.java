package Models;

import Models.enums.ParkingFloorStatus;

import java.util.List;

public class Floor extends BaseModel{
    private int floorNumber;
    private String floorName;
//    private Operator floorOperator;
    private Gate entryGate;
    private Gate exitGate;
    private List<Spot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;

    public Floor(){

    }

    public Floor(int floorNumber, String floorName, Gate entryGate, Gate exitGate, List<Spot> parkingSpots, ParkingFloorStatus parkingFloorStatus) {
        this.floorNumber = floorNumber;
        this.floorName = floorName;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.parkingSpots = parkingSpots;
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public List<Spot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<Spot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
