/*Uma loja de livros, aberta de segunda	a domingo, anota	diariamente	durante cada semana a quantidade de livros vendidos. Determinar em que dia de uma determinada semana ocorreu a maior venda e qual foi a quantidade de livros
vendida nesse dia. O seu programa deve aceitar a digitação	 para cada dia da semana. Considere	segunda-feira como o	primeiro dia. */

import javax.swing.JOptionPane;

public class Livraria {
    public static void main(String[] args) {
        int semanas = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de semanas: "));
        int maxVendas = 0;
        String diaMax = "";
        int semanaMax = 0;
        String nomeDia = "";
        for (int i = 1; i <= semanas; i++) {
            for (int x = 2; x <= 8; x++) {
                switch (x) {
                    case 2:
                        nomeDia = "segunda";
                        break;
                    case 3:
                        nomeDia = "terça";
                        break;
                    case 4:
                        nomeDia = "quarta";
                        break;
                    case 5:
                        nomeDia = "quinta";
                        break;
                    case 6:
                        nomeDia = "sexta";
                        break;
                    case 7:
                        nomeDia = "sábado";
                        break;
                    case 8:
                        nomeDia = "domingo";
                        break;
                }
                int vendas = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Semana: " + i + " Insira a quantidade de vendas do dia " + nomeDia + ": "));
                if (vendas > maxVendas) {
                    maxVendas = vendas;
                    diaMax = nomeDia;
                    semanaMax = i;
                }
            }
        }
        System.out.println("semana: " + semanaMax + ", dia: " + diaMax + ", vendas: " + maxVendas);
    }
}
