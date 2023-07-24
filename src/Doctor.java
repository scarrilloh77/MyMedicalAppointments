public class Doctor {
    int id;
    String name;
    String specialty;

    // Constructor
    /*
    Doctor(){
        System.out.println("Construyendo el Object Doctor");
    }
     */

    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    // Comportamientos
    public void showName(){
        System.out.println(name);
    }
}
