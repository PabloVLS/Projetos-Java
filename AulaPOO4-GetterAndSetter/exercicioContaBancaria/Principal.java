
package exercicioContaBancaria;


public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        
        conta.setTitular("Bostinha");
        conta.setSaldo(1000);
        
        System.out.println("O seu saldo é:"+conta.getSaldo());
        
        conta.depoistar(500);
        
        System.out.println("O seu saldo é:"+conta.getSaldo());
        conta.sacar(800);
        
        System.out.println("O seu saldo é:"+conta.getSaldo());
        
        
        
        
    }
}
