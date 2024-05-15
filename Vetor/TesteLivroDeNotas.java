/*
4.1 Permitir ao professor dizer quantos alunos ele tem.
4.2 Dizer qual o nome de sua disciplina.
4.3 Digitar as notas nota1 e nota2 de cada aluno (escreva um método para isso).
4.4 Mostrar um menu, com as seguintes opções.
4.4.1 1- Exibir médias
4.4.2 2- Exibir desvio padrão
4.4.3 3- Exibir maior nota.
 */

import java.util.Scanner;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da disciplina: ");
        String nome = sc.next();
        System.out.println("Quantos alunos: ");
        int quantosAlunos = sc.nextInt();
        LivroDeNotas livroDeNotas = new LivroDeNotas(nome, quantosAlunos);
        livroDeNotas.obterNotas();
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("1 - média");
            System.out.println("2 - desvio padrão");
            System.out.println("3 - maior nota");
            System.out.println("0 - sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    return;
                case 1:
                    System.out.println("A média foi: " + livroDeNotas.mediaDaTurma());
                    break;
                case 2:
                    System.out.println("Desvio padrão: " + livroDeNotas.desvioPadraoDaTurma());
                    break;
                case 3:
                    double maiorNota1 = livroDeNotas.maiorNota1();
                    double maiorNota2 = livroDeNotas.maiorNota2();
                    double maior = maiorNota1 >= maiorNota2 ? maiorNota1 : maiorNota2;
                    System.out.println("Maior nota: " + maior);
                    break;
            }
        }
        sc.close();
    }
}
