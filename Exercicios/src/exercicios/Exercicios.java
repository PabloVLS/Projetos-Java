
package exercicios;

import java.util.Scanner;


public class Exercicios {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Tabuada Do Número: ");
        num = scan.nextInt();
        
        for(int i=1; i<300;i++){
            System.out.println(+num+ "*" +i+ "="+ num * i);
        }
                
    }
    
}
