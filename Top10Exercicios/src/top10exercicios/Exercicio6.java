//Criar um programa que solicite ao usuário que informe o valor do raio de uma esfera e
//calcule o seu volume.
package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        volumeEsfera();
    }
    public static void volumeEsfera(){
       Double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio de uma esfera: "));
       
       Double volume = (4.0/3.0) * 3.14 * (raio*raio*raio);
       
       JOptionPane.showMessageDialog(null, "O volume da esfera é :"+volume);
}
}

