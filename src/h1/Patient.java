package h1;


public class Patient {
    private String name;
    private int prio;

    public Patient(String name, int prio) {
        this.name = name;
        this.prio = prio;
    }

    public String getName() {
        return name;
    }

    public int getPrio() {
        return prio;
    }

    @Override
    public String toString() {
        return String.format("Patient: %-10s | Priorität: %2d", name, prio);
    }
}