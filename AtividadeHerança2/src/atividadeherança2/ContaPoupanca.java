package atividadeherança2;

/**
 *
 * @author Pablo
 */
public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;
    
    public ContaPoupanca(String titular, double saldo, double rendaMensal, double taxaJuros) {
        super(titular, saldo, rendaMensal);
        if(taxaJuros>=0.6 && taxaJuros<=2.8){
            this.taxaJuros = taxaJuros;
        }else{
            System.out.println("Taxa Invalida!!\n");
        }   
    }
    
    public double aplicarJuros(double taxaJuros){
        double saldoAtual = getSaldo(); 
        double juros = saldoAtual * (taxaJuros / 100);
        return juros;
    }
    @Override
    public String toString() {
        return "ContaPoupanca{" +
               "titular='" + getTitular() + '\'' +
               ", saldo=" + getSaldo() +
               ", rendaMensal=" + getRendaMensal() +
               ", taxaJuros=" + taxaJuros +
               '}';
    }
    
}
