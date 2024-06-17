package Repositories;

import Exceptions.GateNotFoundException;
import Models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Long, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(Long id) {
        Gate gate = gateMap.get(id);
        if (gate == null) {
            throw new GateNotFoundException();
        }
        return gate;
    }

    public void put(Gate gate) {
        gateMap.put(gate.getId(), gate);
        System.out.println("Gate added: " + gate.getId());
    }
}
