import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = leitor.nextInt();
        System.out.println(Math.sqrt(num));
        leitor.close();
    }
}
