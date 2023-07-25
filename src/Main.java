import model.Doctor;

import java.util.Date;

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
//        Doctor myDoctor = new Doctor("Pedro Sanchez", "Cirgujano"); // OBJECT of TYPE Doctor
//        System.out.println(myDoctor.name);
//        System.out.println(myDoctor.specialty);

        // -----------------------------------------------------------

        // String name = "Ann"; // OBJETO name de TIPO String.
//        int i = 0; // VARIABLE int de TIPO PRIMITIVO int.
//        int b = 2;
//        b = i;
//        // b = 0

//        Patient myPatient = new Patient("Maria Gutierrez", "mgutierrez@test.com");
//        Patient myPatient2 = new Patient("Camila Cantillo", "ccantillo@test.com");
//        System.out.println(myPatient.getName()); //Maria Gutierrez
//        System.out.println(myPatient2.getName()); //Camila Cantillo
//        myPatient2 = myPatient;
//        System.out.println(myPatient.getName()); //Maria Gutierrez
//        System.out.println(myPatient2.getName()); //Maria Gutierrez
//        myPatient2.setName("Carla Garcia");
//        System.out.println(myPatient.getName()); //Carla Garcia
//        System.out.println(myPatient2.getName()); //Carla Garcia

        // -----------------------------------------------------------

//        Patient myPatient = new Patient("Oscar Cordoba", "ocordoba@test.com");
//        myPatient.setWeight(54.6);
//        System.out.println(myPatient.getWeight());
//
//        myPatient.setPhoneNumber("3105982304"); //El número debe ser de 8 dígitos máximo!
//        System.out.println(myPatient.getPhoneNumber()); //null
//        myPatient.setPhoneNumber("31059823");
//        System.out.println(myPatient.getPhoneNumber()); //31059823

//        System.out.println(myPatient.name);
//        System.out.println(myPatient.email);

        // -------------------------------------------------------------



        // INCONSITENCE PROBLEM (WE NEED ENCAPSULATION).
//        myPatient.weight = 70.5;
//        myPatient.height = 1.70;
        // ... 5 MONTHS LATER...
//        myPatient.weight = 75.5;
//        myPatient.name = "Juan"; //What!!!

        // ---------------------------Nested Classes--------------------------------
        Doctor myDoctor = new Doctor("Pedro Sanchez", "psanchez@test.com");
        myDoctor.addAvailableAppointment(new Date(), "2pm");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
//        System.out.println(myDoctor.getAvailableAppointments());
        System.out.println(myDoctor);

//        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }

        // --------------------------------------------------------------------------
//        Patient patient = new Patient("Carlos Carrera", "ccarrera@test.com");
//        System.out.println(patient);
    }
}