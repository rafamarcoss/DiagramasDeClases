public class Lector {
    private int idLector;
    private String estado;

    public Lector(int idLector, String estado) {
        this.idLector = idLector;
        this.estado = estado;
    }

    public void reservaLibro(){
        System.out.println("Libro reservado");
    }

    public void entregaLibro(){
        System.out.println("Libro entregado");
    }
}
