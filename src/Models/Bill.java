package Models;

import Models.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private Ticket ticket;
    private LocalDateTime exitTime;
    private double totalAmount;
    private Gate exitGate;
    private BillStatus billStatus;

    public Bill(){

    }

    public Bill(Ticket ticket, LocalDateTime exitTime, double totalAmount, Gate exitGate, BillStatus billStatus) {
        this.ticket = ticket;
        this.exitTime = exitTime;
        this.totalAmount = totalAmount;
        this.exitGate = exitGate;
        this.billStatus = billStatus;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
