package atividadeherança2;

/**
 *
 * @author Pablo
 */
public class Principal {

    public static void main(String[] args) {

        // Objetos da classe ContaBancaria
        ContaBancaria contaBancaria1 = new ContaBancaria("Alice", 1500.00, 3000.00);
        ContaBancaria contaBancaria2 = new ContaBancaria("Bob", 2000.00, 2500.00);

        System.out.println(contaBancaria1.toString());
        System.out.println(contaBancaria2.toString());

        // Objetos da classe ContaPoupanca
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Carlos", 3000.00, 4000.00, 1.5);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("Diana", 2500.00, 4500.00, 2.0);

        System.out.println(contaPoupanca1.toString());
        System.out.println(contaPoupanca2.toString());

        // Objetos da classe ContaCorrente
        ContaCorrente contaCorrente1 = new ContaCorrente("Elisa", 3500.00, 5000.00);
        contaCorrente1.setLimiteEspecial(1000.00);

        ContaCorrente contaCorrente2 = new ContaCorrente("Fernando", 2800.00, 4200.00);
        contaCorrente2.setLimiteEspecial(800.00);

        System.out.println(contaCorrente1.toString());
        System.out.println(contaCorrente2.toString());
    }
}

