public class Impressora {
    public void exibir(float a) {
        System.out.println(a);
    }

    public void exibir(float a, float b) {
        System.out.println(a + "," + b);
    }

    public void exibir(float a, String b) {
        System.out.println(a + "," + b);
    }

    public void exibir(String a, float b) {
        System.out.println(a + "," + b);
    }

    public void exibir(String a, String b, String c) {
        System.out.println(a + "," + b + ", " + c);
    }

    public void exibir(int a, int b, String c) {
        System.out.println(a + "," + b + ", " + c);
    }
}