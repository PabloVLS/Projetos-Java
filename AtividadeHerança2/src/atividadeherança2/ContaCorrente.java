package atividadeherança2;

/**
 *
 * @author IFTM
 */
public class ContaCorrente extends ContaBancaria {
    private double limiteEspecial;
    public ContaCorrente(String titular, double saldo, double rendaMensal) {
        super(titular, saldo, rendaMensal);
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        if((getSaldo()*40/100)>limiteEspecial){
            this.limiteEspecial = limiteEspecial;
        }else{
            System.out.println("Limite Indisponivel!!\n");
        }
        
    }
    
    public void sacar(double sacar){
        if(sacar > this.limiteEspecial){
             double saldinho = getSaldo();
             saldinho= saldinho-sacar;
             setSaldo(saldinho);
        }
    }
    @Override
    public String toString() {
        return "ContaCorrente{" +
               "titular='" + getTitular() + '\'' +
               ", saldo=" + getSaldo() +
               ", rendaMensal=" + getRendaMensal() +
               ", limiteEspecial=" + limiteEspecial +
               '}';
    }
}
