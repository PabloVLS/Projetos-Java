package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

    /*Criar um programa que solicite ao usuário que informe os valores dos lados de um
triângulo e verifique se é possível formar um triângulo com essas medidas. Caso seja
possível, informar também qual é o tipo do triângulo (equilátero, isósceles ou escaleno).*/
    public static void main(String[] args) {
        triangulo();
    }

    public static void triangulo() {

        Integer lado1 = Integer.parseInt(JOptionPane.showInputDialog("Informe os valor de um lado do triangulo: "));
        Integer lado2 = Integer.parseInt(JOptionPane.showInputDialog("Informe os valor de outro lado do triangulo: "));
        Integer lado3 = Integer.parseInt(JOptionPane.showInputDialog("Informe os valor de um lado do triangulo: "));
        
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado1 == lado3) {
                JOptionPane.showMessageDialog(null, "É possível formar um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "É possível formar um triângulo isósceles.");
            } else{
                JOptionPane.showMessageDialog(null, "É possível formar um triângulo escaleno.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível formar um triângulo com essas medidas.");
        }
    }
}
