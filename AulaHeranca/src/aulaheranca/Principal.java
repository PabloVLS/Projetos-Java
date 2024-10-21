package aulaheranca;

/**
 *
 * @author Pablek
 */
public class Principal {

    public static void main(String[] args) {
        
       Funcionario joao = new Funcionario();
       joao.setPrimeiroNome("João");
       joao.setSegundoNome("Gomes");
       joao.setSalario(1900);
       System.out.println("\nNome:"+joao.getPrimeiroNome()+" "+joao.getSegundoNome());
       System.out.println("Salario: R$"+joao.getSalario());
       
       FuncionarioComissionado maria = new FuncionarioComissionado();
       maria.setPrimeiroNome("Maria");
       maria.setSegundoNome("Clara");
       maria.setSalario(2100);
       maria.setComissao(500);
       maria.setVendas(8);
       System.out.println("\nNome:"+maria.getPrimeiroNome()+" "+maria.getSegundoNome());
       System.out.println("Salario fixo: R$"+maria.getSalario());
       System.out.println("Quantidade de Vendas:"+maria.getVendas());
       System.out.println("Comissão por vendas:"+maria.getComissao());
       System.out.println("Pagamento :R$"+maria.calcularPagamentoTotal());
       maria.adicionarVendas(5);
       System.out.println("Pagamento :R$"+maria.calcularPagamentoTotal());
       maria.zerarVendas();
       System.out.println("Pagamento :R$"+maria.calcularPagamentoTotal());
       
    }
    
}
