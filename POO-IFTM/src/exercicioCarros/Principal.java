
package exercicioCarros;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Digite o marca do carro:");
        carro.marca =scan.next();
        System.out.println("Digite o modelo do carro:");
        carro.modelo =scan.next();
        System.out.println("Digite o ano do carro:");
        carro.ano =scan.nextInt();
        carro.verificarTabelaFipe();
        carro.mostrarInformacoes();
    }
}
