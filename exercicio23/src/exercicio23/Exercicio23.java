package exercicio23;

import javax.swing.JOptionPane;

public class Exercicio23 {

    public static void main(String[] args) {

       /* JOptionPane.showMessageDialog(null, "Galo X Libertad");

        JOptionPane.showConfirmDialog(null, "Escolha um: ",
                 "Escolha um", JOptionPane.YES_NO_OPTION);

        Object[] itens = {"Galo", "Libertad", "Empate"};
        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um resultado", "Opção",
                JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        Object[] options = {"OK", "Cancelar", "Voltar"};
        JOptionPane.showOptionDialog(null, "Click OK para continuar", "AVISO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        String nome = JOptionPane.showInputDialog(null, "Digite seu Jogador favorito:");
        JOptionPane.showInternalMessageDialog(null, nome);
        */
       
       somaNumeros();
    }
    public static void somaNumeros(){
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro numero :"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Entre co m o segundo numero:"));
                
        double soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "O valor da soma é :" +soma);
    }

}
