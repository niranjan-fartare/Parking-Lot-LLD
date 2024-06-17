package Exceptions;

public class GateNotFoundException extends RuntimeException{
    public GateNotFoundException(){
        super("Gate not found");
    }
}
