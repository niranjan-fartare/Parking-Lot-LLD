package Models;

import Models.enums.PaymentMethod;
import Models.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private Bill bill;
    private LocalDateTime paymentTime;
    private double amount;
//    private User paymentUser;
    private PaymentMethod paymentMethod;
    private String referenceId;
    private PaymentStatus paymentStatus;
    public Payment(){

    }

    public Payment(Bill bill, LocalDateTime paymentTime, double amount, PaymentMethod paymentMethod, String referenceId, PaymentStatus paymentStatus) {
        this.bill = bill;
        this.paymentTime = paymentTime;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.referenceId = referenceId;
        this.paymentStatus = paymentStatus;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
