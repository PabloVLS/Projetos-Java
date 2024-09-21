
package exercicioContaBancaria;

import java.util.Scanner;

/**
 *
 * @author Pablo 
 */
public class Principal {
    
    public static void main(String[] args) {
        int operacao=9;
        
        Scanner scan = new Scanner(System.in);
        ContaBancaria cliente = new ContaBancaria();
        System.out.println("Digite seu nome:");
        cliente.titular = scan.nextLine();
        System.out.println("Digite seu saldo:");
        cliente.saldo = scan.nextDouble();
        while(operacao!=0){
            System.out.println("Qual operação você deseja fazer ?");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Extrato");
            System.out.println("0 - Sair");
            
            operacao=scan.nextInt();
            if(operacao==1){
                cliente.depositar();
            }else if(operacao==2){
                cliente.sacar();
            }else if(operacao==3){
                cliente.verSaldo();
            }
        } 
    }
}
