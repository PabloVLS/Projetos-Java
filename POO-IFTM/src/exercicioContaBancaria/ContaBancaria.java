
package exercicioContaBancaria;

import java.util.Scanner;
public class ContaBancaria {
    public double saldo;
    public String titular;
    double depositando;
    double sacando;
    Scanner scan = new Scanner(System.in);
    
    public void depositar(){
        System.out.println("Digite o valor a depositar:");
        
        depositando=scan.nextDouble();
        saldo+=depositando;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nDepositado com Sucesso!");
    }
    
    public void sacar(){
        System.out.println("Digite o valor a sacar:");
        sacando=scan.nextDouble();
        saldo-=sacando;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nSacado com Sucesso!");
    }
    
    public void verSaldo(){
        System.out.println("O seu saldo é:"+saldo);
        System.out.println("");
    }

}
