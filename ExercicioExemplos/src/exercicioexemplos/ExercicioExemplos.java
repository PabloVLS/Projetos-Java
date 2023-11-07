package exercicioexemplos;

import java.util.Scanner;

public class ExercicioExemplos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, contador = 0;
       
        System.out.println("Digite um número:");
        num = scan .nextInt();
        
        while(num != 0){

            if(num >=100 && num<=300){
                contador ++;
            }
            System.out.println("Digite um numero");
            num = scan.nextInt();
        }
        System.out.println("A quantidade de números entre 100 e 300 é "+contador);
        
    }
    
}
