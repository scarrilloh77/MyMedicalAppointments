public class Doctor {
    static int id = 0; // Autoincrement cause is static
    String name;
    String specialty;

    // Constructor

    Doctor(){
        System.out.println("Construyendo el Object Doctor");
        id++;
    }

    /*
    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }
    */


    // Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id); // I dont call like Doctor.id cause is 'static '
    }
}
