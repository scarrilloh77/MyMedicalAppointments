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

    }
}