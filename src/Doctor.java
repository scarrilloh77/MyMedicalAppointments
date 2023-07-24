import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; // Autoincrement cause is static
    private String name;
    private String email;
    private String specialty;


    // Constructor

//    Doctor(){
//        System.out.println("Construyendo el Object Doctor");
//    }


    Doctor(String name, String specialty) {
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.specialty = specialty;
    }


    // Comportamientos
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id); // I dont call like Doctor.id cause is 'static '

    }


    // Available Appointment
    public static class AvailableAppointment {
        private int id; // Of the AvailableAppointment.
        private Date date;
        private String time;

        //Constructor
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    // Appointments collection
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
}
