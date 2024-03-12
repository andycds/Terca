import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        System.out.println("Digite sua idade: ");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        // if (idade >= 18) {
        // System.out.println("É maior de idade");
        // } else {
        // System.out.println("Não é maior de idade");
        // }
        String mensagem = idade >= 18 ? "Maior" : "Menor";
        System.out.println(mensagem);
        sc.close();
    }
}
