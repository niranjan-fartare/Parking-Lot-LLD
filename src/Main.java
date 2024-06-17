import Controllers.InitController;
import Repositories.GateRepository;
import Repositories.ParkingFloorRepository;
import Repositories.ParkingLotRepository;
import Repositories.ParkingSpotRepository;
import Services.InitializationService;

public class Main {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();

        InitializationService initializationService = new InitializationService(gateRepository,parkingFloorRepository, parkingLotRepository, parkingSpotRepository );
        InitController initController = new InitController(initializationService);
        initController.init();     
        System.out.println("");
    }
}