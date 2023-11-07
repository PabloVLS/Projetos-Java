/* Ler um conjunto de números reais , armazendando em vetor e calcular o quadrado dos componente
deste vetor , armazenando o resultado em outro vetor . Os conjuntos tem 10 elementos cada. Imprimir
todos os conjuntos
*/
package exerciciosvetores;

import java.util.Scanner;

public class ExercicioVetor3 {

    public static void main(String[] args) {

        int numero[] = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um conjunto de 10 números para saber o quadrado dele :");

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "° número:");
            numero[i] = scan.nextInt();
        }
        
        
        for (int i = 0; i < 10; i++) {
            numero[i] *= numero[i];
            System.out.println("O quadrado de "+(i+1)+" é: "+numero[i] );
            //System.out.println(numero[i] *= numero[i]);
        }
    }
}
