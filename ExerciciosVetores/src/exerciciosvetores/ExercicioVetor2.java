/*Faça um programa que peça ao
usuário para digitar 10 números reais.
Ao final imprima cada valor na ordem
inversa à leitura.*/
package exerciciosvetores;

import java.util.Scanner;

public class ExercicioVetor2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero[] = new int[10];

        
        for (int i = 0; i <= 9; i++) {
            System.out.println("Entre com o "+(i+1)+" °numero:");
            numero[i] = scan.nextInt();
        }
        System.out.println("Os numeros inversos são: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numero[i]);
        }
       
    }
}
