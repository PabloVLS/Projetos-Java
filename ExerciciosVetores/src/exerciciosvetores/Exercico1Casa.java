/*Faca um programa que leia dez conjuntos de dois valores, o primeiro representando o
numero do aluno e o segundo representando a sua altura em metros. Encontre o aluno ´
mais baixo e o mais alto. Mostre o numero do aluno mais baixo e do mais alto, juntamente ´
com suas alturas.
*/
package exerciciosvetores;

import java.util.Scanner;

public class Exercico1Casa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numeroAluno[] = new double[3];
        double altura[] = new double[3];
        double maior = 03, maiorNumero = 0 ;
        double menor = 230, menorNumero = 0 ;

        System.out.println("Digite o número dos alunos !");

        for(int i = 0 ; i < 3; i++){
            System.out.println("Digite o numero do "+(i+1)+"° aluno :");
            numeroAluno[i] = scan.nextDouble();
            System.out.println("Digite a altura do " + (i + 1) + "° aluno :");
            altura[i] = scan.nextDouble();

            if (altura[2] < menor){
                menor = altura[i];
                menorNumero = numeroAluno[i];
            }
            if (altura[2] > maior){
                maior = altura[i];
                maiorNumero = numeroAluno[i];   
            }
        }
        System.out.println("Número do menor aluno: "+menorNumero);
        System.out.println("Altura do menor aluno: "+menor);
        System.out.println("Número do maior aluno: "+maiorNumero);
        System.out.println("Altura do maior aluno: "+maior);
    }
    
}
    
