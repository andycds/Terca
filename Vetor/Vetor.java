import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tamanho do vetor?");
        int tamanho = sc.nextInt();
        int vetor[] = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição " + (i + 1));
            vetor[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Média: " + soma / (double) vetor.length);
        sc.close();
    }
}