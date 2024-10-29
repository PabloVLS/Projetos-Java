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
        this.limiteEspecial = limiteEspecial;
    }
    
}
