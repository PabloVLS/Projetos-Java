//Criar um programa que leia dois números inteiros e exiba a soma dos números pares
//entre eles (incluindo os números informados). Se os dois números forem iguais, verificar
//se ele é par e somá-lo caso seja.
package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        imparPar(args);
    }
    
    public static void imparPar(String[] args) {
        Integer numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        Integer numero2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite outro número:"));
        
        
        if(numero1 % 2 == 0 && numero2 % 2 == 0){
            double soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, soma);
            JOptionPane.showMessageDialog(null, " Os números são pares , e o resultado e par !");
        }
        else{
            double soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, soma);
            JOptionPane.showMessageDialog(null, " Os números não são pares , e o resultado e impár !");
        }
           
        
    }
    
}
