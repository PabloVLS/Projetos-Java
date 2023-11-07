//Criar um programa que solicite ao usuário que informe a sua altura e peso e calcule o
//seu índice de massa corporal (IMC). Em seguida, exibir uma mensagem informando se a
//pessoa está abaixo do peso, com peso normal, com sobrepeso, obesa ou muito obesa.

package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
       indiceMassa();
    }
    public static void indiceMassa() {
       Double altura = Double.parseDouble(JOptionPane.showInputDialog("Para calcular seu IMC precisamos da sua Altura:"));
       Double peso = Double.parseDouble(JOptionPane.showInputDialog("Agora seu peso:"));  
       
      double imc = peso /(altura*altura);
      if(imc < 18.5){
          JOptionPane.showMessageDialog(null, imc+"\nAbaixo do peso normal !");
      }
      else if(imc > 18.5 && imc <= 25){
          JOptionPane.showMessageDialog(null, imc+"\nPeso normal !");
      }
      else if(imc > 25 && imc <= 30){
          JOptionPane.showMessageDialog(null, imc+"\nExcesso de Peso !");
      }
      else if(imc > 30 && imc <= 35){
          JOptionPane.showMessageDialog(null, imc+"\nObesidade classe 1 !");
      }
      else if(imc > 35 && imc <= 40){
          JOptionPane.showMessageDialog(null, imc+"\nObesidade classe 2 !");
      }
      else if(imc > 40){
          JOptionPane.showMessageDialog(null, imc+"\nObesidade classe 3 !");
      }
    }
}
