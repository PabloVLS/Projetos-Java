package exercicioCarros;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Principal {
    public static void main(String[] args) {
        
        
        Carro carro1 = new Carro("Chevrolet", "Onix", 2011, 52000);
        carro1.mostrarInformacoes();
        carro1.verificarTabelaFipe(52000);
        Carro carro2 = new Carro("Ford", "Ford-Gt", 2020, 1230000);
        carro2.mostrarInformacoes();
        carro2.verificarTabelaFipe(1230000);
        Carro carro3 = new Carro("Ferrari", "599XX", 2014, 7085000);
        carro3.mostrarInformacoes();
        carro2.verificarTabelaFipe(7085000);
       
        
         
        
        
        
    }
}
