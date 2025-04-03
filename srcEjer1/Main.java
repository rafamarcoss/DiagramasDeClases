public class Main {
    public static void main(String[] args) {

        Persona Rafa = new Persona(1, "Rafa", "rafaelmarcos2604@gmail.com");
        Persona Angel = new Persona(2, "Angel", "angel@gmail.com");

        Rafa.walk();
        Angel.walk();

        Rafa.run();
        Angel.run();

        Rafa.speak();
        Angel.speak();
    }
}