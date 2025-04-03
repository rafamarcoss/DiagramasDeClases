public class Persona {
    private String nombre;
    private String raza;
    private String dni;

    public Persona(String raza, String dni, String nombre) {
        this.raza = raza;
        this.dni = dni;
        this.nombre = nombre;
    }

    public void walk(){
        System.out.println(nombre + " Andando...");
    }

    public void run(){
        System.out.println(nombre + " Corriendo...");
    }

    public void speak(){
        System.out.println(nombre + " Hablando...");
    }
}
