public class Animal {
    private String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public void respirar() {
        System.out.println("El animal está respirando.");
    }

    public void hacerAccionEspecifica() {
        switch (tipo) {
            case "Pez":
                System.out.println("El pez está nadando.");
                break;
            case "Perro":
                System.out.println("El perro está ladrando.");
                break;
            case "Gato":
                System.out.println("El gato está maullando.");
                break;
            default:
                System.out.println("El animal no tiene una acción específica definida.");
                break;
        }
    }

    public static void main(String[] args) {
        Animal pez = new Animal("Pez");
        Animal perro = new Animal("Perro");
        Animal gato = new Animal("Gato");

        pez.respirar();
        pez.hacerAccionEspecifica();

        perro.respirar();
        perro.hacerAccionEspecifica();

        gato.respirar();
        gato.hacerAccionEspecifica();
    }
}