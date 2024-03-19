import javax.swing.JOptionPane;

public class ParMaximo {
    public static void main(String[] args) {
        int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de m"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n"));
        int maximo = 0;
        int xMaximo = 0;
        int yMaximo = 0;
        for (int x = 0; x <= m; x++) {
            for (int y = 0; y <= n; y++) {
                // xy-x^2+y
                int expressao = x * y - (x * x) + y;
                if (expressao > maximo) {
                    maximo = expressao;
                    xMaximo = x;
                    yMaximo = y;
                }
                System.out.println("(" + x + ", " + y + ") = " + expressao);
            }
        }
        System.out.println("Máximo: (" + xMaximo + ", " + yMaximo + ") = " + maximo);
    }
}
