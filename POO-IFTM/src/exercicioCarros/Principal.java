package exercicioCarros;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        Carro carro1 = new Carro();
        carro1.marca="Chevrolet";
        carro1.modelo="Onix";
        carro1.ano=2011;
        carro1.mostrarInformacoes();
        carro1.verificarTabelaFipe();
        
         
        Carro carro2 = new Carro();
        carro2.marca="Chevrolet";
        carro2.modelo="Corvette";
        carro2.ano=2018;
        carro2.mostrarInformacoes();
        carro2.verificarTabelaFipe();
        
        
        
    }
}
