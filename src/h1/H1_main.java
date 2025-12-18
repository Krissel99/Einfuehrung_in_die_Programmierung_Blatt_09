package h1;

public class H1_main {
    public static void main(String[] args) {
        PrioListe myList = new PrioListe();
        Patient   Werner = new Patient("Werner", 15);
        Patient   Peter  = new Patient("Peter", 11);
        Patient   Alice  = new Patient("Alice", 28);
        Patient   Bob    = new Patient("Bob", 9);
        Patient   Eve    = new Patient("Eve", 25);
        Patient   David  = new Patient("David", 12);

        myList.addPatient(Peter);
        myList.addPatient(Alice);
        myList.addPatient(Bob);
        myList.addPatient(Eve);
        myList.addPatient(David);

        Patient nextPatient = myList.getNextPatient();
        int     patientPos  = myList.getPosition(Peter);

        myList.printList();
    }

}