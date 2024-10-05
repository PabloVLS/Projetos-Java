
package exercicioCarros;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Carro {
    Scanner scan = new Scanner(System.in);
    private String marca;
    private String modelo;
    private int ano;
    private double valor;
    private double valorFipe=valor;
    
    public Carro(){
    
    }
    
    public Carro(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }
    
    public void mostrarInformacoes(){
        System.out.println("\n\nMarca:"+marca);
        System.out.println("Modelo:"+modelo);
        System.out.println("Ano:"+ano);
        
    }
    
    public void verificarTabelaFipe(double precoCarro){
        
        double valorFipe = precoCarro * 1.20; // Calcular e armazenar o valorFipe localmente
        System.out.println("O valor do " + this.modelo + " com acréscimo de 20% será de: " + valorFipe);
    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(double valorFipe) {
        this.valorFipe = valorFipe;
    }

    
}
