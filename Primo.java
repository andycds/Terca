import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = tecl.nextInt();
        boolean ehPrimo = true;
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                ehPrimo = false;
                divisor = numero;
            }
        }
        if (ehPrimo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo.");
        }
        tecl.close();
    }
}
