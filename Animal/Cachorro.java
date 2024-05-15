public class Cachorro extends Mamifero {

    static final int QUANTIDADE_PATAS_CACHORRO = 4;

    public Cachorro(String nome) {
        super(nome, QUANTIDADE_PATAS_CACHORRO);
    }

    public String toString() {
        return "Cachorro com nome " + nome + " e " + patas + " patas.";
    }
}
