
package exercicioexemplos;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in); 
    int total = 0 , valor = 0;
    boolean terminar = false;
    
    do{
        System.out.println("Valor a adicionar");
        valor = scan.nextInt();
        
        if(valor > 0){
            total += valor;
        }
        else{
             System.out.println("Valor Invalido !");
             terminar = true;
            }
        if(total > 20){
            terminar = true;
        }
        System.out.println("Total: "+total);
    }while(terminar != true);
     System.out.println("Acabou ZÉ");
    
     
    
    }

   
    
    
}
