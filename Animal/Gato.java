public class Gato extends Mamifero {

    static final int QUANTIDADE_PATAS_GATO = 4;

    public Gato(String nome) {
        super(nome, QUANTIDADE_PATAS_GATO);
    }

    public String toString() {
        return "Gato[nome: " + nome + ", patas: " + patas + "]";
    }
}
