package aulainterface;

/**
 *
 * @author Ligia
 */
public class Carro extends VeiculoN
{

    public Carro(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
    }

    @Override
    public double calcularImposto() 
    {
        return super.getValor() * 0.04;
    }
    
}
