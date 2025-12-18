package h2;

public class H2_main {
    public static void main(String[] args) {
        Passenger   AnnaMueller     = new Passenger("Anna Müller", 7, true);
        Passenger   MaxSchmidt      = new Passenger("Max Schmidt", 3, false);
        Passenger   SophieWeber     = new Passenger("Sophie Weber", 12, true);
        Passenger   LeonFischer     = new Passenger("Leon Fischer", 5, true);
        Passenger   EmmaBecker      = new Passenger("Emma Becker", 14, false);
        Passenger   PaulMeyer       = new Passenger("Paul Meyer", 2, true);
        Passenger   MiaSchulz       = new Passenger("Mia Schulz", 9, true);
        Passenger   FelixWagner     = new Passenger("Felix Wagner", 11, false);
        Passenger   LauraHoffmann   = new Passenger("Laura Hoffmann", 1, true);
        Passenger   JonasKlein      = new Passenger("Jonas Klein", 8, true);
        Passenger   LenaKoch        = new Passenger("Lena Koch", 15, false);
        Passenger   TimRichter      = new Passenger("Tim Richter", 4, true);
        Passenger   SarahNeumann    = new Passenger("Sarah Neumann", 6, true);
        Passenger   JanBraun        = new Passenger("Jan Braun", 10, false);
        Passenger   LisaKrueger     = new Passenger("Lisa Krüger", 13, true);
        Passenger   LukasZimmermann = new Passenger("Lukas Zimmermann", 3, true);
        Passenger   JuliaHartmann   = new Passenger("Julia Hartmann", 7, false);
        Passenger   TobiasLange     = new Passenger("Tobias Lange", 5, true);
        Passenger   MarieWerner     = new Passenger("Marie Werner", 9, true);
        Passenger   DavidSchmitt    = new Passenger("David Schmitt", 11, false);
        Passenger[] PassengerList   = {JuliaHartmann, TobiasLange, MarieWerner, DavidSchmitt};
        Bus         Tram            = new Bus();
        Bus         BetterTram      = new Bus();
        Tram.enterBus(AnnaMueller);
        Tram.enterBus(MaxSchmidt);
        Tram.enterBus(SophieWeber);
        Tram.enterBus(LeonFischer);
        Tram.enterBus(EmmaBecker);
        Tram.enterBus(PaulMeyer);
        Tram.enterBus(MiaSchulz);
        Tram.enterBus(FelixWagner);
        Tram.enterBus(LauraHoffmann);
        Tram.enterBus(JonasKlein);

        for (int i = 0; i < 4; i++) {
            Tram.nextStop();
        }

        BetterTram.enterBus(LenaKoch);
        BetterTram.enterBus(TimRichter);
        BetterTram.enterBus(SarahNeumann);
        BetterTram.enterBus(JanBraun);
        BetterTram.enterBus(LisaKrueger);
        BetterTram.enterBus(LukasZimmermann);

        Tram.nextStop(PassengerList);

        Tram.findPassengersWithoutTickets();

        String[] TransferList = {"Jonas Klein", "Sophie Weber", "Marie Werner"};

        Tram.transferPassengers(BetterTram, TransferList);
    }
}