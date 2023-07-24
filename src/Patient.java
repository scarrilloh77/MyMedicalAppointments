public class Patient {
    int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email) {
        this.name = name;
        this.email = email;
//        this.weight = 80;
//        System.out.println(weight + "Kg.");
    }
}
