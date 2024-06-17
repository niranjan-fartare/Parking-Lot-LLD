package Models;

import Models.enums.GateStatus;
import Models.enums.GateType;

public class Gate extends BaseModel{
    private GateType gateType;
    private String gateName;
    private Operator gateOperator;
    private int gateNumber;
    private GateStatus gateStatus;
    public Gate(){

    }

    public Gate(GateType gateType, String gateName, Operator gateOperator, int gateNumber, GateStatus gateStatus) {
        this.gateType = gateType;
        this.gateName = gateName;
        this.gateOperator = gateOperator;
        this.gateNumber = gateNumber;
        this.gateStatus = gateStatus;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public Operator getGateOperator() {
        return gateOperator;
    }

    public void setGateOperator(Operator gateOperator) {
        this.gateOperator = gateOperator;
    }
}
