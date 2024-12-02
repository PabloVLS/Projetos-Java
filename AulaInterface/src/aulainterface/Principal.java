package aulainterface;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos(); 
        Carro carro1 = new Carro("Toyota", "Corolla", 2021, 80000);
        Carro carro2 = new Carro("VolksWagen", "Fox Connect", 2020, 40000);
        
        gerenciador.adicionarVeiculo(carro1);
        gerenciador.adicionarVeiculo(carro2);
        
        System.out.println("Veículos sem PNE no sistema:"); 
        gerenciador.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciador.calcularImpostoTotalVeiculosN()); 
        
        
        
        
        GerenciadorVeiculos gerenciador2 = new GerenciadorVeiculos();
        Moto moto1 = new Moto("CG", "150 Cilindradas", 2020, 15000.00);
        Moto moto2 = new Moto("Harley Daividson", "600 Cilindradas", 2020, 150000.00);
        
        gerenciador2.adicionarVeiculo(moto1);
        gerenciador2.adicionarVeiculo(moto2);
        System.out.println("Motos sem PNE no sistema:"); 
        gerenciador2.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciador2.calcularImpostoTotalVeiculosN()); 
        
        System.out.println("Imposto individual por Moto: R$"+gerenciador2.impostoPorVeiculoN(moto2));
    }
   
}
