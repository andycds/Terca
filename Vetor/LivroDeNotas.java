import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class LivroDeNotas {
    private String nomeDisciplina;
    private double notas1[];
    private double notas2[];
    private double medias[];
    private int qtdeAlunos;

    public LivroDeNotas(String nomeDisciplina, int qtdeAlunos) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas1 = new double[qtdeAlunos];
        this.notas2 = new double[qtdeAlunos];
        this.medias = new double[qtdeAlunos];
        this.qtdeAlunos = qtdeAlunos;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void obterNotas() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < qtdeAlunos; i++) {
            System.out.println("digite a primeira nota do aluno " + i + ": ");
            notas1[i] = sc.nextDouble();
            System.out.println("digite a segunda nota " + i + ": ");
            notas2[i] = sc.nextDouble();
            medias[i] = (notas1[i] + notas2[i]) / 2;
        }
        sc.close();
    }

    public double maiorNota1() {
        double maior = 0;
        for (int i = 0; i < qtdeAlunos; i++) {
            if (notas1[i] > maior) {
                maior = notas1[i];
            }
        }
        return maior;
    }

    public double maiorNota2() {
        return Arrays.stream(notas2).max().orElse(0);
    }

    public double segundaMaiorNota1() {
        double maior = maiorNota1();
        double segundaMaior = 0;
        for (double nota : notas1) {
            if (nota < maior && nota > segundaMaior) {
                segundaMaior = nota;
            }
        }
        return segundaMaior;
    }

    public double segundaMaiorNota2() {
        double maior = 0;
        double segundaMaior = 0;
        for (double nota : notas2) {
            if (nota > maior) {
                segundaMaior = maior;
                maior = nota;
            } else if (nota > segundaMaior) {
                segundaMaior = nota;
            }
        }
        return segundaMaior;
    }

    public void estatisticas() {
        System.out.println(String.format("A média é %f, a variância é %f e o desvio padrão é %f.",
                mediaDaTurma(), varianciaDaTurma(), desvioPadraoDaTurma()));
    }

    public double mediaDosAprovados() {
        return Arrays.stream(medias).filter(m -> m >= 5).average().orElse(0);
    }

    public void estatisticasDosAprovados() {
        System.out.println(String.format(
                "Estatística apenas dos aprovados.\nA média é %f, a variância é %f e o desvio padrão é %f.",
                mediaDosAprovados(), varianciaDosAprovados(), desvioPadraoDosAprovados()));
    }

    public double desvioPadraoDaTurma() {
        return Math.sqrt(varianciaDaTurma());
    }

    public double mediaDaTurma() {
        return Arrays.stream(medias).average().orElse(0);
    }

    public double varianciaDaTurma() {
        double mediaDaTurma = mediaDaTurma();
        double soma = 0;
        for (double media : medias) {
            soma += Math.pow(media - mediaDaTurma, 2);
        }
        return soma / (qtdeAlunos - 1);
    }

    public double varianciaDosAprovados() {
        double mediaAprovados = mediaDosAprovados();
        double soma = 0;
        int quantidadeAlunosAprovados = 0;
        for (double media : medias) {
            if (media >= 5) {
                quantidadeAlunosAprovados++;
                soma += Math.pow(media - mediaAprovados, 2);
            }
        }
        return soma / (quantidadeAlunosAprovados - 1);
    }

    public double desvioPadraoDosAprovados() {
        return Math.sqrt(varianciaDosAprovados());
    }

    public static void main(String[] args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas("teste", 5);
        System.out.println(livroDeNotas.segundaMaiorNota2());
        livroDeNotas.estatisticas();
    }

}