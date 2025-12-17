package h1;

public class H1_main {
    public static void main(String[] args) {
        PrioListe myList1 = new PrioListe();
        Patient   Werner  = new Patient("Werner", 15);
        Patient   Peter   = new Patient("Peter", 11);
        Patient   Alice   = new Patient("Alice", 28);
        Patient   Bob     = new Patient("Bob", 9);
        Patient   Eve     = new Patient("Eve", 25);
        Patient   David   = new Patient("David", 12);

        myList1.addPatient(Werner);
        myList1.addPatient(Peter);
        myList1.addPatient(Alice);
        myList1.addPatient(Bob);
        myList1.addPatient(Eve);
        myList1.addPatient(David);


        myList1.printList();
    }

}