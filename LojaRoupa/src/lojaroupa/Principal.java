package lojaroupa;

/**
 *
 * @author Pablo
 */
public class Principal {

   
    public static void main(String[] args) {
        
        // Testando FilialPatrocinioLojaFisica
        System.out.println("Testando FilialPatrocinioLojaFisica");
        FilialPatrocinioLojaFisica lojaFisica = new FilialPatrocinioLojaFisica("Carlos", "Rua das Flores, 123", "calca", 50.0);
        System.out.println(lojaFisica);  // Exibe o estado inicial do item
        
        // Teste de descrição inválida
        lojaFisica.setDescrição("sapatilha");
        System.out.println(lojaFisica);  // Verifica se a descrição foi alterada para "sem cadastro"
        
        // Teste de valor igual a 0
        lojaFisica.setValor(0);
        System.out.println("Valor após ajuste: " + lojaFisica.getValor());  // Verifica se o valor foi alterado para 10.00
        
        // Testando o empréstimo (o item está disponível)
        lojaFisica.emprestar();  // O item esta disponível para empréstimo
        
        // Tentando emprestar o item novamente depois de já ter sido emprestado
        lojaFisica.emprestar();  // O item não está disponivel
        
        // Testando a devolução
        lojaFisica.devolver();  // A devolução foi deu certo
        
        // Exibindo as informações do item apos a devoluçao
        System.out.println(lojaFisica);  // O item agora está disponivel novamente


        // Testando FilialPatosLojaVirtual
        System.out.println("\nTestando FilialPatosLojaVirtual");
        FilialPatosLojaVirtual lojaVirtual = new FilialPatosLojaVirtual("www.lojavirtual.com", "João", true, "T-Shirt", 30.0);
        System.out.println(lojaVirtual);  // Exibe o estado inicial do item
        
        // Teste de descrição inválida
        lojaVirtual.setDescrição("jaqueta");
        System.out.println(lojaVirtual);  // Verifica se a descrição foi alterada corretamente
        
        // Teste de valor igual a 0
        lojaVirtual.setValor(0);
        System.out.println("Valor após ajuste: " + lojaVirtual.getValor());  // Verifica se o valor foi alterado para 10.00
        
        // Testando o empréstimo (o item está disponível e o entregador está disponível)
        lojaVirtual.emprestar();  // O item está disponível para empréstimo e será entregue
        
        // Tentando emprestar o item novamente (o entregador não está disponível)
        lojaVirtual.setStatusEntregador(false);  // Marcando o entregador como indisponível
        lojaVirtual.emprestar();  // O entregador está indisponível
        
        // Testando a devolução (o entregador está disponível)
        lojaVirtual.devolver();  // O entregador está a caminho e o item será devolvido
        
        // Tentando devolver o item quando o entregador não está disponível
        lojaVirtual.setStatusEntregador(false);  // Marcando o entregador como indisponível
        lojaVirtual.devolver();
    }
    
}
