
package exercicioContaBancaria;

/**
 *
 * @author Pablito
 */
public class ContaBancaria {
    private double saldo;
    private String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double depoistar(double depositado){
        this.saldo = saldo +depositado;
        System.out.println("Depositado:"+depositado);
        return saldo;
    }
    
    public double sacar(double sacar){
        this.saldo = saldo - sacar;
        System.out.println("Sacado:"+sacar);
        return saldo;
    }
    
}
