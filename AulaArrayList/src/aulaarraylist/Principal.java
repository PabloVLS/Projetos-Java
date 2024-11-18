
package aulaarraylist;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("PABLEK-");
        lista.add("Lucas");
        lista.add("Pedro");
        lista.add("Paulo");
        lista.add(2, "Bosta");
        lista.add(2.4);
        lista.add(100);
        lista.add(true);
        
       
        System.out.println("A Lista tem: "+lista.size() + " posições!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        System.out.println("Elemento: "+ lista.get(3));
        System.out.println("Removendo");
        lista.remove(6);        
        
        for(int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        String elemento = "Paulo";
        if(lista.contains(elemento)){
            System.out.println("Tem a porra do elemento");
        }else{
            System.out.println("Nao tem isso nao");
        }
        System.out.println("O valor 2.4 está localizado no seguinte indice: "+ lista.indexOf(2.4));
    }
    
}
