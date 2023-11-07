/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 931655
 */
public class Garrafa {
    
    public String modelo;
    public String cor;
    public String material;
    public int tamanho;
    public boolean tampada;
    
    public void fechada()
    {
        if(this.tampada == true)
        {
            System.out.println("A Garrafa está fechada ! Não pode beber .");
        }
        else
        {
            System.out.println("A Garrafa está aberta ! Beba com Moderação");
        }
    }
    public void status()
    {
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Material: "+this.material);
        System.out.println("Tamanho: "+this.tamanho);
        System.out.println("Está Fechada ?"+this.tampada);
    }
            
    
}
