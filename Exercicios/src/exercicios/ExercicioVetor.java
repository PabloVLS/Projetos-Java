
package exercicios;

import java.util.Scanner;

public class ExercicioVetor {

    public static void main(String[] args) {
        
        int cont = 5;
        Scanner scan = new Scanner(System.in);
        String nomes[] = new String[cont];

        System.out.println("Cadastro de Nomes: ");
        for (int i = 0; i < cont; i++) {
            System.out.println("Entre com o " + (i + 1) + " ° nome");
            nomes[i] = scan.next();
        }

        System.out.println("Os nomes Cadastrados são :");

        for (int i = 0; i < cont; i++) {
            System.out.println(+ (i + 1) + " ° nome: "+nomes[i]);
        }
    }
}
