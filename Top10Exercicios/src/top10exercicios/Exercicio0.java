//Criar um programa que leia o nome e a idade de três pessoas e exiba o nome da pessoa mais velha
package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio0 {
    
    public static void main(String[] args) {
       Nome3Pessoas();
    }

    public static void Nome3Pessoas() {
        String nome1 = JOptionPane.showInputDialog("Digite o nome da 1 pessoa: ");
        Integer idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        String nome2 = JOptionPane.showInputDialog("Digite o nome da 2 pessoa: ");
        Integer idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        String nome3 = JOptionPane.showInputDialog("Digite o nome da 3 pessoa: ");
        Integer idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        
        if(idade1 > idade2 && idade1 > idade3){
            JOptionPane.showMessageDialog(null, nome1+ " é o mais velho !");
        }
        if(idade2 > idade1 && idade2 > idade3){
            JOptionPane.showMessageDialog(null, nome2+ " é o mais velho !");
        }
        if(idade3 > idade1 && idade3 > idade2){
            JOptionPane.showMessageDialog(null, nome3+ " é o mais velho !");
        }
        
    }
    
}
