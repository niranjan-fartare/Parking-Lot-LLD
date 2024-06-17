package Exceptions;

public class ParkingLotNotFoundException extends RuntimeException{
    public ParkingLotNotFoundException(){
        super("The parking lot was not found.");
    }
}
