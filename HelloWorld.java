import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String args[]) {
        double primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        String segundo = JOptionPane.showInputDialog("Digite um número");
        double segundoNumero = Double.parseDouble(segundo);
        JOptionPane.showMessageDialog(null, primeiroNumero + segundoNumero);
        /*
         * String um = "1";
         * String dois = "2";
         * int tres = 3;
         * int quatro = 4;
         * System.out.println("**************");
         * System.out.println(um + dois);
         * System.err.println(tres + quatro);
         */
    }
}
