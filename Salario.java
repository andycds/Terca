import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Escreva seu salário:"));

        double salarioMinimo = 1412;

        if (salario >= salarioMinimo) {
            JOptionPane.showMessageDialog(null, "Você ganha pelo menos um salário minimo ;)");
        } else {
            JOptionPane.showMessageDialog(null, "Você não ganha um salário mínimo! ;(");
        }
    }
}
