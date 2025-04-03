public class Prestamo {
    private String fechaEntrega;
    private String fechaDevolucion;
    private boolean multa;

    public Prestamo(String fechaEntrega, String fechaDevolucion, boolean multa) {
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = multa;
    }

    public boolean estamultado(){
        return multa;

    }
    public boolean multar(){
        multa = true;
        return multa;
    }
}
