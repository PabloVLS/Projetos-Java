package projetoUFC;

import java.util.Random;
import javax.swing.JOptionPane;

public class Luta{

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado = false;

    Random aleatorio = new Random();

  


    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria() == desafiante.getCategoria() && desafiado != desafiante) {
            this.setAprovado(true);
            System.out.println("Luta foi aprovada!");
        } else {
            this.setAprovado(false);
            System.out.println("Luta não foi aprovada!");
        }

    }

    public void lutar(Lutador desafiado, Lutador desafiante) {
        if (this.aprovado == true) {
            int vencedor = aleatorio.nextInt(3); // dentro do if

            switch (vencedor) {
                case 0:
                    System.out.println(desafiado.getNome()+  " Venceu\n");
                    desafiado.ganharLuta();
                    System.out.println(desafiante.getNome()+ " Perdeu");
                    desafiante.perderLuta();
                    
                    break;
                case 1:
                    System.out.println(desafiado.getNome()+  " Perdeu");
                    desafiado.perderLuta();
                    System.out.println(desafiante.getNome()+ " Venceu\n");
                    desafiante.ganharLuta();
                    break;
                case 2:
                    System.out.println(" A Luta Empatou\n");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    
            }
        } else {
            System.out.println(" Não poderá lutar ! Se Fudeu");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
