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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        Garrafa c1 = new Garrafa ();
        c1.modelo = "Eucatex";
        c1.cor = "Azul";
        c1.material = "Aluminio" ;
        c1.tamanho = 1;
        c1.tampada = false;
        c1.status ();
        c1.fechada();
    }
    
}
