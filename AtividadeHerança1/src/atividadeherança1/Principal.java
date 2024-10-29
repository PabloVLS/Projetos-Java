package atividadeherança1;

/**
 *
 * @author Pablo
 */
public class Principal {

    
    public static void main(String[] args) {
        Cliente pedrin = new Cliente(5, "Pedrin Bala Tensa", "18/09/2004", "baludo@gmail.com", "Rua dos Bostas", "99-84564158");
        System.out.println(pedrin.toString());
        
        Usuario fallen = new Usuario(6, "Gabriel Toledo", "01/02/2010", "Professor", "HEHEHEHEHEHEHEHEE");
        System.out.println(fallen.toString());
        
        Pessoa pessoa2 = new Pessoa(1, "lucas", "14/02/1990");
        Pessoa pessoa3 = new Pessoa(3, "Alexssander", "28/09/1999");
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
    }
    
}
