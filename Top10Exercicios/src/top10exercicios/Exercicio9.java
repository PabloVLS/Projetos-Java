//Criar um programa que solicite ao usuário que informe um número inteiro e exiba todos
//os números primos menores ou iguais a esse número.
package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {
        numPrimos();
    }

    public static void numPrimos() {
        Integer numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro : "));

        for (int i = 2; i <= numero1; i++) {
            boolean primo = false;

            for (int divisivel = 2; divisivel < i; divisivel++) {

                if (i % divisivel == 0) {
                    primo = true;
                }
            }

            if (primo == false) {
                System.out.println("Os números primos de " + numero1 + " são :" + i);
            }

        }
    }
}
