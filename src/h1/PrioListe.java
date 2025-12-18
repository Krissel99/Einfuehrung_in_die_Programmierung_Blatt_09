package h1;

import java.util.ArrayList;

public class PrioListe {
    private ArrayList<Patient> myList = new ArrayList<>();

    public void addPatient(Patient p) {
        if (myList.isEmpty() || p.getPrio() > myList.getLast().getPrio()) {
            myList.add(p);
            return;
        }

        for (Patient q : myList) {
            if (p.getPrio() < q.getPrio()) {
                myList.add(myList.indexOf(q), p);
                return;
            }
        }
//        myList.sort(Comparator.comparing(Patient::getPrio));
    }

    public Patient getNextPatient() {
        Patient first = myList.getFirst();
        myList.remove(myList.getFirst());
        return first;
    }

    public int getPosition(Patient p) {
        return myList.indexOf(p);
    }

    public void printList() {
        System.out.println("Priorität | Patient");
        for (Patient p : myList) {
            System.out.printf("%-10d  %-10s %n", p.getPrio(), p.getName());
        }
    }
}