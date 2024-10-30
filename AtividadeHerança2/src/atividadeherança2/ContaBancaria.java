package atividadeherança2;

/**
 *
 * @author Pablo
 */
public class ContaBancaria {
    private String titular;
    private double saldo;
    private double rendaMensal;

    public ContaBancaria(String titular, double saldo, double rendaMensal) {
        if(titular.equals("")){
            titular="não identificado";
        }else{
            this.titular = titular;
        }
        
        this.saldo = saldo;
        this.rendaMensal = rendaMensal;
        
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    
    public double getRendaMensal() {
        return rendaMensal;
    }
    
    public void depositar(double valor){
       this.saldo+=valor;
       verificarSaldo();
    }

   public void sacar(double montante){
       if(this.saldo>montante){
           this.saldo=this.saldo-montante;
           System.out.println("Saque Efetuado com Sucesso!\n");
       }else{
           System.out.println("Saldo Insuficiente!\n");
       }
       verificarSaldo();
   }
   
   public void verificarSaldo(){
       System.out.println("O saldo na conta de:"+this.titular+" é : R$"+this.saldo+".00");
   }
   @Override
    public String toString() {
        return "ContaBancaria{" +
               "titular='" + titular + '\'' +
               ", saldo=" + saldo +
               ", rendaMensal=" + rendaMensal +
               '}';
    }

}
