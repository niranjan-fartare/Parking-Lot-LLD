package Services;

import Models.*;
import Models.enums.*;
import Repositories.GateRepository;
import Repositories.ParkingFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {
    private static int pId = 0;
    private GateRepository gateRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitializationService(){

    }

    public InitializationService(GateRepository gateRepository, ParkingFloorRepository parkingFloorRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public void init(){
        System.out.println("Starting Initialization...!");

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(++pId);
        parkingLot.setParkingLotName("Seasons Parking Lot");
        parkingLot.setParkingLotAddress("Hadapsar, Pune");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);

        List<Floor> floors = new ArrayList<>();
        for(int i=1;i<=10;i++){
            Floor floor = new Floor();
            floor.setId(i);
            floor.setFloorNumber(i);
            floor.setFloorName("Floor " + i);
            floor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);

            Gate entryGate = new Gate();
            entryGate.setGateName(i+"th Entry Gate");
            entryGate.setGateNumber(i*1001);
            entryGate.setId(i*1001);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setGateStatus(GateStatus.AVAILABLE);

            Operator entryGateOperator = new Operator();
            entryGateOperator.setOperatorName(entryGate.getGateName()+"'s Operator");

            entryGate.setGateOperator(entryGateOperator);
            gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setGateName(i+"th Exit Gate");
            exitGate.setGateNumber(i*1002);
            exitGate.setId(i*1002);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setGateStatus(GateStatus.AVAILABLE);

            Operator exitGateOperator = new Operator();
            exitGateOperator.setOperatorName(exitGate.getGateName()+"'s Operator");

            exitGate.setGateOperator(exitGateOperator);
            gateRepository.put(exitGate);

            floor.setEntryGate(entryGate);
            floor.setExitGate(exitGate);

            List<Spot> spots = new ArrayList<>();
            for(int j=1;j<=10;j++){
                Spot spot = new Spot();
                spot.setId(i*100+j);
                spot.setSpotNumber(i*100+j);
                spot.setSpotStatus(SpotStatus.FREE);
                if(spot.getSpotNumber() % 2 == 0){
                    spot.setVehicleType(VehicleType.FOUR_WHEELER);
                } else spot.setVehicleType(VehicleType.TWO_WHEELER);
                spots.add(spot);
                parkingSpotRepository.put(spot);
            }
            floor.setParkingSpots(spots);
            floors.add(floor);
            parkingFloorRepository.put(floor);

        }

        parkingLot.setFloorList(floors);
        parkingLotRepository.put(parkingLot);
    }
}
