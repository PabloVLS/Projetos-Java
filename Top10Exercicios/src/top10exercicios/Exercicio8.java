//Criar um programa que solicite ao usuário que informe a sua data de nascimento (dia,
//mês e ano) e calcule a sua idade em anos completos.
package top10exercicios;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) {
            diasVida();
    }

    public static void diasVida() {
        Integer dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu anivérsario:"));
        Integer mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu anivérsario:"));
        Integer ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu anivérsario:"));

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();
        int idade = Period.between(dataNascimento, dataAtual).getYears();

        JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " anos.");
    }

}

