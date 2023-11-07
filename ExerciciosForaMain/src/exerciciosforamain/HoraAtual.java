package exerciciosforamain;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoraAtual {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("" + dtf.format(LocalDateTime.now()));
         double LocalDateTime = scan.nextDouble();
        horas(LocalDateTime);
    }

    public static void horas(double LocalDateTime) {
        if (LocalDateTime >= 1 &&  LocalDateTime <= 12.59) {
            System.out.println("Bom Dia !");
        } else if (LocalDateTime >= 13 && LocalDateTime <= 18.59) {
            System.out.println("Boa Tarde !");
        } else {
            System.out.println("Boa Noite !");
        }
    }
}