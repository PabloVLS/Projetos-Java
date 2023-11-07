/*Crie um projeto em Java que calcule e apresente o valor do volume de
uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que
as variáveis: V, R e A representam respectivamente o volume, o raio e
a altura.
Vamos declarar as variáveis V, R e A como double, onde o usuário vai
inserir as variáveis de altura e de raio. Agora vamos escrever a
fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma
mensagem contendo o resultado do volume encontrado.
Lembrando que o cálculo deve ser realizado em um método
separado da main(). */
package exerciciosforamain;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeOleo {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a altura da lata de  óleo: ");
        double altura = scan.nextDouble();
        
        System.out.println("Digite a largura do raio: ");
        double raio = scan.nextDouble();
       
        valor(raio, altura);
    }
    
    
    public static void valor(double raio , double altura){
        DecimalFormat df = new DecimalFormat("##,00");
        double volume = 3.14159 * (raio * raio) *altura;
        System.out.println("Volume da lata de óleo é : "+ df.format (volume));
        
    }
}
