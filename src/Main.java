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

        Patient myPatient = new Patient("Oscar Cordoba", "ocordoba@test.com");
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