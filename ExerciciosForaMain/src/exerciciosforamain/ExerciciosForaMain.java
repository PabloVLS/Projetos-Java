
package exerciciosforamain;

import java.util.Scanner;

public class ExerciciosForaMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double valor1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double valor2 = scan.nextDouble();

        soma(valor1, valor2);
        subtracao(valor1, valor2);
        multiplicacao(valor1, valor2);
        divisao(valor1, valor2);
    }

    public static void soma(double valor1, double valor2) {
        double soma = valor1 + valor2;
        System.out.println("Soma: " + soma);
    }

    public static void subtracao(double valor1, double valor2) {
        double subtracao = valor1 - valor2;
        System.out.println("Subtração: "+ subtracao);
    }

    public static void multiplicacao(double valor1, double valor2) {
        double multiplicacao = valor1 * valor2;
         System.out.println("Multiplicação: "+ multiplicacao);
    }

    public static void divisao(double valor1, double valor2) {
        double divisao = valor1 / valor2;
        System.out.println("Divisão: "+divisao);
    }
}
