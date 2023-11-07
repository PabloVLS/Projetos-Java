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
public class aula2 {

    public String modelo;
    
    
    
    public static void main(String[] args) 
    {
       caneta2 c1 = new caneta2();
       c1.modelo = "BIC";
       c1.cor = "ROSA";
       c1.ponta = 0.5f;
       c1.carga = 1;
       c1.tampada = false;
       c1.status();
       c1.rabiscar();
       
       caneta2 c2 = new caneta2 ();
       
    }
    
}
