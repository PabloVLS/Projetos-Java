/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canetateste;

/**
 *
 * @author 931655
 */
public class caneta2 {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    protected boolean tampada;
    
    public void rabiscar()
    {
        if(this.tampada == true)
        {
            System.out.println("Erro! Não posso rabiscar");
        }
        else
        {
            System.out.println("Estou rabiscando , e muito legal");
        }
    }
    public void tampar()
    {
        this.tampada = true;
    }
    public void destampar()
    {
        this.tampada = false;
    }
    
    public void status()
    {
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Cor: " +this.cor);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " +this.carga);
        System.out.println("Está tampada ?" +this.tampada);
    }
}
