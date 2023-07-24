import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        /*
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Juan Carrillo";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);
        */

//        showMenu();
        Doctor myDoctor = new Doctor("Pedro Sanchez", "Cirgujano");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialty);

//        int i = 0; // VARIABLE int de TIPO PRIMITIVO int.
//        String name = "Ann"; // OBJETO name de TIPO String.

        Patient myPatient = new Patient("Oscar Cordoba", "ocordoba@test.com");
        myPatient.setWeight(54.6);
        System.out.println(myPatient.getWeight());

        myPatient.setPhoneNumber("3105982304"); //El número debe ser de 8 dígitos máximo!
        System.out.println(myPatient.getPhoneNumber()); //null
        myPatient.setPhoneNumber("31059823");
        System.out.println(myPatient.getPhoneNumber()); //31059823
//        System.out.println(myPatient.name);
//        System.out.println(myPatient.email);

        // INCONSITENCE PROBLEM (WE NEED ENCAPSULATION).
//        myPatient.weight = 70.5;
//        myPatient.height = 1.70;
        // ... 5 MONTHS LATER...
//        myPatient.weight = 75.5;
//        myPatient.name = "Juan"; //What!!!
    }
}