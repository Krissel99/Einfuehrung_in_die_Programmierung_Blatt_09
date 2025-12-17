package h2;


public class Passenger {
    private String name;
    private int planned;
    private int visited;
    private boolean ticket;


    public Passenger(String name, int planned, boolean ticket) {
        this.name    = name;
        this.planned = planned;
        this.ticket  = ticket;
        visited      = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getPlanned() {
        return this.planned;
    }

    public int getVisited() {
        return this.visited;
    }

    public boolean getTicket() {
        return this.ticket;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }
}