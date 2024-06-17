package Repositories;

import Exceptions.TicketNotFoundException;
import Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> ticketsMap;

    public TicketRepository() {
        this.ticketsMap = new HashMap<>();
    }

    public Ticket getTicket(Long id) {
        Ticket ticket = ticketsMap.get(id);
        if (ticket == null) {
            throw new TicketNotFoundException();
        }
        return ticket;
    }

    public void put(Ticket ticket) {
        ticketsMap.put(ticket.getId(), ticket);
        System.out.println("Ticket added: " + ticket.getId());
    }
}
