package aulainterface;

/**
 *
 * @author Ligia
 */
public class Moto extends VeiculoN
{

    public Moto(String marca, String modelo, int ano, double valor) 
    {
        super(marca, modelo, ano, valor);
    }

    @Override
    public double calcularImposto() 
    {
        return getValor() * 0.02;
    }
    
}
