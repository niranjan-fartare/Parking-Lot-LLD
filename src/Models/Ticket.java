package Models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel {
//    private User userId;
    private LocalDateTime entryTime;
    private Gate entryGate;
    private Spot parkingSpot;
    private Vehicle vehicle;
    public Ticket(){

    }

    public Ticket(LocalDateTime entryTime, Gate entryGate, Spot parkingSpot, Vehicle vehicle) {
        this.entryTime = entryTime;
        this.entryGate = entryGate;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Spot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(Spot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
