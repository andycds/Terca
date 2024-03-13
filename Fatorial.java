// Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        // ir multiplicando um número de 2 até n,
        // guardando o resultado
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        // imprimir o resultado
        System.out.println(resultado);
        sc.close();
    }
}
