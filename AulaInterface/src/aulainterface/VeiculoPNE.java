package aulainterface;

import java.util.ArrayList;

/**
 *
 * @author Ligia
 */
public abstract class VeiculoPNE extends VeiculoN implements Tributavel 
{
    private ArrayList<String> modificacoes; 

    public VeiculoPNE(String marca, String modelo, int ano, double valor, ArrayList<String> modificacoes) 
    {
        super(marca, modelo, ano, valor);
        this.modificacoes = modificacoes;
        
    }

    public ArrayList<String> getModificacoes() 
    {
        return modificacoes;
    }
    
    
    
    
}
