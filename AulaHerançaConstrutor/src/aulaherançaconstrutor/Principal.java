package aulaherançaconstrutor;

/**
 *
 * @author Pablek
 */
public class Principal {

    public static void main(String[] args) {
        Funcionario pedrin = new Funcionario("Pedrin", "Costela", 800.00);
        FuncionarioComissionado romarin = new FuncionarioComissionado("Romarin", "Avelã", 620.00, 600,4);
        System.out.println("Funcionario Comun:");
        System.out.println("Nome: " + pedrin.getPrimeiroNome() + " " + pedrin.getSegundoNome());
        System.out.println("Salário: R$ " + pedrin.getSalario());
        
        
        
        System.out.println("\nFuncionario Comissionado:");
        System.out.println("Nome: " + romarin.getPrimeiroNome() + " " + romarin.getSegundoNome());
        System.out.println("Salário Base: R$ " + romarin.getSalario());
        System.out.println("Comissão: R$ " + romarin.getComissao());
        System.out.println("Pagamento:R$"+romarin.calcularPagamentoTotal());
    }
    
}
