package h1;

import java.util.ArrayList;
import java.util.Comparator;

public class PrioListe {
    private ArrayList<Patient> myList = new ArrayList<>();


    public void addPatient(Patient p) {
        myList.add(p);
        myList.sort(Comparator.comparing(Patient::getPrio));
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