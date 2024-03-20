import java.util.Scanner;

public class SegundoGrau {
    public static void main(String[] args) {
        Scanner chocolate = new Scanner(System.in);
        System.out.println("Digite os coeficientes a, b e c de uma equação do segundo grau na forma ax^2 + bx + c = 0");
        double a = chocolate.nextDouble();
        double b = chocolate.nextDouble();
        double c = chocolate.nextDouble();
        double delta = (b * b) - (4 * a * c);
        System.out.println(delta);
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(raiz1 + ", " + raiz2);
        chocolate.close();
    }
}
