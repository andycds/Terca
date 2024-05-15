public class ImpressoraTeste {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        impressora.exibir(1f);
        impressora.exibir(2f, 3f);
        impressora.exibir(4f, "5s");
        impressora.exibir("6s", 7f);
        impressora.exibir("8s", "9s", "10s");
        impressora.exibir(11, 12, "13s");
    }
}
