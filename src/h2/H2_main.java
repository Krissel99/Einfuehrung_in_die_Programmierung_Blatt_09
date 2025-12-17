package h2;

public class H2_main {
    public static void main(String[] args) {
        Passenger Anna       = new Passenger("Anna", 5, true);
        Passenger Ben        = new Passenger("Ben", 7, true);
        Passenger Clair      = new Passenger("Clair", 6, true);
        Bus       Tram       = new Bus();
        Bus       BetterTram = new Bus();
        Tram.enterBus(Anna);
        Tram.enterBus(Ben);
        Tram.enterBus(Clair);

        for (int i = 0; i < 4; i++) {
            Tram.nextStop();
        }


        Tram.findPassengersWithoutTickets();
        String[] TransferList = {"Ben", "Clair"};

        Tram.transferPassengers(BetterTram, TransferList);
    }
}