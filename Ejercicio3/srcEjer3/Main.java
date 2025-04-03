public class Main {
    public static void main(String[] args) {

        Coche clio = new Coche (1, 5, "gris");
        clio.acelerar();
        clio.frenar();
        clio.repatinar();

        Persona rafa = new Persona("Cordobeh", "11111111T", "Rafa");
        rafa.walk();
        rafa.run();
        rafa.speak();
    }
}