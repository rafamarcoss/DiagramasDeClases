public class Copia {
    private int idCopia;
    private String estado;

    public Copia(int idCopia, String estado) {
        this.idCopia = idCopia;
        this.estado = estado;
    }

    public void prestar(){
        System.out.println("Libro prestado");
    }
}
