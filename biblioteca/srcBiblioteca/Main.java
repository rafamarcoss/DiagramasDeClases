public class Main {
    public static void main(String[] args) {
        Libro librito = new Libro("Angel amil y sus aventuras", "Aventura", "Lope", 2004, 41431);
        Copia copi = new Copia(1, "Entregado");
        Prestamo prestamito = new Prestamo("10-1-2004", "11-2-2004", false);
        Autor autorcito = new Autor("Rafa", "Espanola", "15-6-05");
        Lector lectorcito = new Lector(1, "Entregado");

        librito.getNombreAutor();
        copi.prestar();
        prestamito.estamultado();
        prestamito.multar();
        prestamito.estamultado();
        lectorcito.entregaLibro();
        lectorcito.reservaLibro();
    }
}