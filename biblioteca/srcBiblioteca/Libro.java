public class Libro {
    private String titulo;
    private String tipo;
    private String editorial;
    private int ano;
    private int ISBN;

    public Libro(String titulo, String tipo, String editorial, int ano, int ISBN) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.ano = ano;
        this.ISBN = ISBN;
    }

    public String getNombreAutor(){
        return "Rafael Marcos";
    }
}
