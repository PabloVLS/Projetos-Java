//Criar um programa que leia dois números inteiros e exiba o resultado da operação
//escolhida pelo usuário (adição, subtração, multiplicação ou divisão).
package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        operacao();
    }
    public static void operacao() {
       Double num1 = Double.parseDouble( JOptionPane.showInputDialog("Digite o primeiro número para fazer a Conta:"));
       Double num2 = Double.parseDouble( JOptionPane.showInputDialog("Digite o segundo número para fazer a Conta:"));
       
      Object[] itens = {"Adicao", "Subtracao", "Multiplicacao", "Divisao"};
        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha a Operação", "Opção",
                JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
       if(selectedValue == itens[0]){   
           double resultado = num1 + num2;
           JOptionPane.showMessageDialog(null, "Resultado é:"+resultado);
       }
       else if(selectedValue == itens[1]){
           double resultado = num1 - num2;
           JOptionPane.showMessageDialog(null, "Resultado é:"+resultado);
       }
       else if(selectedValue == itens[2]){
           double resultado = num1 * num2;
           JOptionPane.showMessageDialog(null, "Resultado é:"+resultado);
       }
       else if(selectedValue == itens[3]){
           double resultado = num1 / num2;
           JOptionPane.showMessageDialog(null, "Resultado é:"+resultado);
       } 
       }
    }
   
