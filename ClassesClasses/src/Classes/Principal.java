
package Classes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PetShop cliente1 = new PetShop ();
        
        cliente1.nome = "Jenivaldo";
        cliente1.cpf     =  "123.456.78";
        cliente1.endereco = "Alameda das Perobas";
        cliente1.telefone = "11575852";
        cliente1.imprimir();
        
        PetShop cliente2 = new PetShop();
        
        cliente1.nome = "Estrogildo";
        cliente1.cpf     =  "993.856.48";
        cliente1.endereco = "Rosa Brandão";
        cliente1.telefone = "1125452";
        cliente1.imprimir();
    }
}
