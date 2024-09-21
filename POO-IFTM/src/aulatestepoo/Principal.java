package aulatestepoo;

/**
 *
 * @author IFTM
 */
public class Principal {

   
    public static void main(String[] args) {
        Empregado maria = new Empregado();
        maria.nome = "Maria Costela ";
        maria.endereco = "Rua Cadeirada";
        maria.funcao = "Vendedora";
        maria.salario = 9000.00;
        
        String aux = maria.verificarNomeFuncao();
        System.out.println(aux);
        
        if(maria.verificarSalario()){
            System.out.println("Salário de "+ maria.nome + " é: R$"+ maria.salario);
        }else{
            System.out.println("Sálario inexistente.");
        }
        
        System.out.println("\n\n");
        
        
        Empregado joao = new Empregado();
        joao.nome = "Joao Badaras ";
        joao.endereco = "Rua Datena";
        joao.funcao = "Vendedor de Arroz";
        joao.salario = 50.00;
        
        String aux1 = joao.verificarNomeFuncao();
        System.out.println(aux1);
        
        if(joao.verificarSalario()){
            System.out.println("Salário de "+ joao.nome + " é: R$"+ joao.salario);
        }else{
            System.out.println("Sálario inexistente.");
        }
    }
    
}
