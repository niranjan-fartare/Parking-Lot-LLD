package Services.Strategies;

import Models.Bill;
import Models.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
