package top10exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {
        notaAlunos();
    }

    public static void notaAlunos() {
        Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota Do 1 Aluno"));
        Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota Do 2 Aluno"));
        Double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota Do 3 Aluno"));

        double media = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null, "A média aritmetica dos alunos é: " + media);

        if (media > 7) {
            JOptionPane.showMessageDialog(null, "Aluno está APROVADO !!!!");
        } else if (media < 5) {
            JOptionPane.showMessageDialog(null, "Aluno está REPROVADO !!!!");
        } else if (media >= 5 && media <= 7) {
            JOptionPane.showMessageDialog(null, "Aluno está em RECUPERAÇÃO !!!!");
        }

    }
}
