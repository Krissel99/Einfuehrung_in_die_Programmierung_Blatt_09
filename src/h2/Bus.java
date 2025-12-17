package h2;


import java.util.ArrayList;
import java.util.Iterator;


public class Bus {
    private ArrayList<Passenger> passengers;

    public Bus() {
        this.passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p) {
        passengers.add(p);
    }

    private void exitBus() {
        passengers.removeIf(p -> p.getVisited() == p.getPlanned());
    }

    public void nextStop(Passenger[] boarding) {
        for (Passenger p : passengers) {
            int newVisited = p.getVisited()+1;
            p.setVisited(newVisited);
        }
        exitBus();

        for (Passenger nowBoarding : boarding) {
            passengers.add(nowBoarding);
        }
    }

    public void nextStop() {
        for (Passenger p : passengers) {
            int newVisited = p.getVisited()+1;
            p.setVisited(newVisited);
        }
        exitBus();
    }

    public ArrayList<Passenger> findPassengersWithoutTickets() {
        ArrayList<Passenger> passengerWithoutTickets = new ArrayList<>();
        for (Passenger p : passengers) {
            if (!p.getTicket()) {
                passengerWithoutTickets.add(p);
            }
        }
        passengers.removeIf(p -> !p.getTicket());
        return passengerWithoutTickets;

    }

    public void transferPassengers(Bus otherBus, String[] passengerNames) {
        for (String names : passengerNames) {
            for (Passenger p : passengers) {
                if (p.getName().contains(names)) {
                    otherBus.enterBus(p);
                }
            }
        }
        for (Passenger b : otherBus.passengers) {
            passengers.remove(b);
        }
    }
}