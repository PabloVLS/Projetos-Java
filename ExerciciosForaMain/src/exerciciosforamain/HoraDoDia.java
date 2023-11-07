/*A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa
tarde e Boa noite.
Lembrando que deve ser realizado em um método separado da
main().*/
package exerciciosforamain;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoraDoDia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o horario: ");
        double hora = scan.nextDouble();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("" + dtf.format(LocalDateTime.now()));
        horas(hora);
    }

    public static void horas(double hora) {
        if (hora >= 1 && hora <= 12.59) {
            System.out.println("Bom Dia !");
        } else if (hora >= 13 && hora <= 18.59) {
            System.out.println("Boa Tarde !");
        } else {
            System.out.println("Boa Noite !");
        }
    }
}
