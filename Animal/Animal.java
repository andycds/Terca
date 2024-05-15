public class Animal {
    String nome;
    int patas;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal(int patas, String nome) {
        this(nome);
        this.patas = patas;
    }
}