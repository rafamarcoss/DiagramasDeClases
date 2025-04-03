public class Persona {
    protected int id;
    protected String nombre;
    protected String email;

    public Persona(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void speak(){
        System.out.println(nombre + " Habla");
    }

    public void run(){
        System.out.println(nombre + " Corre");
    }

    public void walk(){
        System.out.println(nombre + " Camina");
    }
}
