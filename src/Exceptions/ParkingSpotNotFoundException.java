package Exceptions;

public class ParkingSpotNotFoundException extends RuntimeException{
    public ParkingSpotNotFoundException(){
        super("The parking spot could not be found");
    }
}
