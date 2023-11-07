/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author 931655
 */
public class Caneta 
{
    public String modelo;
    private float ponta;
    private boolean tampada;
    
    
    public Caneta(String modelo, float ponta)
    {
        this.setModelo(modelo);
        this.setPonta(ponta);
    }
    
    
    
    
    
    /*public Caneta ()
    {
        this.setModelo("NICK");
        this.setPonta(0.4f);
        this.tampar();*/
    
    
   public String getModelo(){
       return this.modelo;
   }
   public void setModelo(String m){
       this.modelo = m;
   }
   public void setPonta (float p){
       this.ponta = p;
   }
   public float getPonta (){
      return this.ponta ;
   }
   public void tampar(){
       this.tampada = true;
   }
   public void destampada(){
     this.tampada = false;  
   }
   public void status(){
       System.out.println("Modelo: "+ this.getModelo());
       System.out.println("Ponta: "+ this.getPonta());
       System.out.println("Está Tampada ?"+ this.tampada);
   }
   
}
