package Exceptions;

public class ParkingFloorNotFoundException extends RuntimeException{
    public ParkingFloorNotFoundException(){
        super("The parking floor could not be found");
    }
}
