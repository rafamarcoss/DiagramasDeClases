public class Coche {
    private int id;
    private int numPuertas;
    private String color;

    public Coche(int id, int numPuertas, String color) {
        this.id = id;
        this.numPuertas = numPuertas;
        this.color = color;
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    public void repatinar(){
        System.out.println("Repatinando...");
    }
}
