
package projetoUFC;

import javax.swing.JOptionPane;


public class ProjetoUFC {

    public static void main(String[] args) {
        
        
        
        Lutador lutador1 = new Lutador("Gabigol", "Brasileiro" , 25, 1.78, 84, 0, 0, 0);
        lutador1.apresentar();
        lutador1.status();
        

        Lutador lutador2 = new Lutador("Hulk", "Brasileiro" , 36, 1.81, 85, 0, 0, 0);
        lutador2.apresentar();
        lutador2.status();

        Luta batalha1 = new Luta();
        batalha1.marcarLuta(lutador1, lutador2);
        batalha1.lutar(lutador1, lutador2);
        
        //System.out.println(lutador1.getNome());
        JOptionPane.showMessageDialog(null, lutador1.getNome()+ " Venceu");
        lutador1.status();
        //System.out.println(lutador2.getNome());
        JOptionPane.showMessageDialog(null, lutador2.getNome()+ " Perdeu");
        lutador2.status();
    }
    
}
