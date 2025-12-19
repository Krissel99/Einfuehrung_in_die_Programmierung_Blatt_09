package h2;

import java.util.ArrayList;
import java.util.Arrays;

public class Bus {
    private ArrayList<Passenger> passengers;

    public Bus() {
        this.passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p) {
        passengers.add(p);
    }

    private void exitBus() {
        passengers.removeIf(p -> p.visited == p.planned);
    }

    public void nextStop(Passenger[] boarding) {
        for (Passenger p : passengers) {
            p.visited++;
        }
        exitBus();

        passengers.addAll(Arrays.asList(boarding));

    }

    public void nextStop() {
        for (Passenger p : passengers) {
            p.visited++;
        }
        exitBus();
    }

    public ArrayList<Passenger> findPassengersWithoutTickets() {
        ArrayList<Passenger> passengerWithoutTickets = new ArrayList<>();
        for (Passenger p : passengers) {
            if (!p.ticket) {
                passengerWithoutTickets.add(p);
            }
        }
        passengers.removeIf(p -> !p.ticket);
        return passengerWithoutTickets;
    }

    public void transferPassengers(Bus otherBus, String[] passengerNames) {
        ArrayList<Passenger> passengersToTransfer = new ArrayList<>();
        for (Passenger p : passengers) {
            for (String names : passengerNames) {
                if (p.name.equals(names)) {
                    passengersToTransfer.add(p);
                }
            }
        }
        for (Passenger p : passengersToTransfer) {
            passengers.remove(p);
            otherBus.enterBus(p);
        }
    }
}