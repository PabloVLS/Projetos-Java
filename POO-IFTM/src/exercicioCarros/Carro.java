
package exercicioCarros;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Carro {
    Scanner scan = new Scanner(System.in);
    public String marca;
    public String modelo;
    public int ano;
    public double valor;
    public double valorFipe=valor;
    
    public void mostrarInformacoes(){
        System.out.println("\n\nMarca:"+marca);
        System.out.println("Modelo:"+modelo);
        System.out.println("Ano:"+ano);
        System.out.println("Valor:"+valorFipe);
    }
    
    public void verificarTabelaFipe(){
        System.out.println("\nDigite o valor do carro(FIPE):"+modelo);
        valor=scan.nextDouble();
        
        valorFipe=valor*1.20;
        System.out.println("O valor do "+modelo+" com acrescimo de 20% será de:"+valorFipe);
        valorFipe=0;
    }

    
}
