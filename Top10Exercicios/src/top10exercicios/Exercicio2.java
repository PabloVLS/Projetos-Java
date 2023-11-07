//Criar um programa que solicite ao usuário que informe o valor do salário de um
//funcionário e calcule o novo salário após um reajuste de 10%.

package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        valorSalarios();
    }
    public static void valorSalarios() {
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário ? R$"));
                
        
        double reajuste = (salario * 10) /100;
        double novoSalario = salario + reajuste;
         JOptionPane.showMessageDialog(null," Seu salário terá um aumento !" );
        JOptionPane.showMessageDialog(null," Seu novo salário é R$:"+ novoSalario );
        
    }
}
