
package exercicio23;

import javax.swing.JOptionPane;

public class ExercicioJO {
    public static void main(String[] args) {
        calculoDesconto();
        
    }
    public static void calculoDesconto(){
        Double valorProduto = Double.parseDouble( JOptionPane.showInputDialog("Dgite o valor do produto"));
        Double desconto = Double.parseDouble( JOptionPane.showInputDialog("Digite a % de desconto: "));
        
        double resultadoDesconto = valorProduto * (desconto / 100);
        double valorTotal = valorProduto - resultadoDesconto;
        
        JOptionPane.showMessageDialog(null, "O Desconto é R$"+ valorTotal);
                
    }
}
