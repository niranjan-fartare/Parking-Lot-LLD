package Models;

import Models.enums.ParkingLotStatus;
import Services.Strategies.BillCalculationStrategy;
import Services.Strategies.SpotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String parkingLotName;
    private List<Floor> floorList;
    private String parkingLotAddress;
    private ParkingLotStatus parkingLotStatus;
    private int capacity;
    private BillCalculationStrategy billCalculationStrategy;
    private SpotAllocationStrategy spotAllocationStrategy;

    public ParkingLot(){

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public SpotAllocationStrategy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public ParkingLot(String parkingLotName, List<Floor> floorList, List<Gate> gateList, String parkingLotAddress, ParkingLotStatus parkingLotStatus, int capacity, BillCalculationStrategy billCalculationStrategy, SpotAllocationStrategy spotAllocationStrategy) {
        this.parkingLotName = parkingLotName;
        this.floorList = floorList;
        this.parkingLotAddress = parkingLotAddress;
        this.parkingLotStatus = parkingLotStatus;
        this.capacity = capacity;
        this.billCalculationStrategy = billCalculationStrategy;
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public String getParkingLotAddress() {
        return parkingLotAddress;
    }

    public void setParkingLotAddress(String parkingLotAddress) {
        this.parkingLotAddress = parkingLotAddress;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
