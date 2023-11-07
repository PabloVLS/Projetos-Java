/*• Crie um vetor de 4 posições
inicializados com valor 2 em cada
uma das posições.
• Atribua os valores 3,4,7,5 a cada
posição do vetor, respectivamente,
um a um.
• Percorra o vetor somando 4 ao
valor armazenado em cada posição.
• Imprima o vetor com valores
atualizados, um valor por linha.*/
package exerciciosvetores;

import java.util.Scanner;

public class ExerciciosVetores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int valor[] = {2, 2, 2, 2};

        valor[0] = 3;
        valor[1] = 4;
        valor[2] = 7;
        valor[3] = 5;

        for (int i = 0; i < 4; i++) {
            valor[i] += 4;
            System.out.println(valor[i]);
        }
    }
}
