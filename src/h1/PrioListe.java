package h1;

import java.util.ArrayList;

public class PrioListe {
    public ArrayList<Patient> myList = new ArrayList<>();

    public void addPatient(Patient p) {
        if (myList.isEmpty() || p.prio > myList.getLast().prio) {
            myList.add(p);
            return;
        }

        for (Patient q : myList) {
            if (p.prio < q.prio) {
                myList.add(myList.indexOf(q), p);
                return;
            }
        }
    }

    public Patient getNextPatient() {
        Patient first = myList.getFirst();
        myList.removeFirst();
        return first;
    }

    public int getPosition(Patient p) {
        return myList.indexOf(p);
    }
}