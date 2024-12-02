package aulainterface;

import java.util.ArrayList;

/**
 *
 * @author Ligia
 */
public class GerenciadorVeiculos 
{
    private ArrayList<VeiculoN> veiculosN;
    
    public GerenciadorVeiculos()
    {
        veiculosN = new ArrayList();
    }
    
    public void adicionarVeiculo(VeiculoN veiculoN) 
    { 
        this.veiculosN.add(veiculoN); 
    }
    
    public double calcularImpostoTotalVeiculosN() 
    { 
        double totalImposto = 0; 
        for (VeiculoN veiculo : veiculosN) 
        { 
            totalImposto += veiculo.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public void listarVeiculosN() 
    { 
        for (VeiculoN veiculo : veiculosN) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    public double impostoPorVeiculoN (VeiculoN veiculo){
        return veiculo.calcularImposto();
        
    }
    
}
