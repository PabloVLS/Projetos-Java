package escola;

/**
 *
 * @author Pablo
 */
public class Principal {

    public static void main(String[] args) {
        UsuarioSistema usuario1 = new UsuarioSistema("Alice", "alice123", 1234, "alice@example.com");
        usuario1.mostrarInformacoes(); 

       
        UsuarioSistema usuario2 = new UsuarioSistema("Bob", "bob456", 5678, "bob@example.com");
        usuario2.mostrarInformacoes(); 
        
        Professor professor1 = new Professor(10001, "Matemática", "Carlos Silva", "carlos.mat", 9876, "carlos@example.com");
        professor1.mostrarInformacoes(); 

        
        Professor professor2 = new Professor(10002, "Física", "Fernanda Lima", "fer.lima", 5432, "fernanda@example.com");
        professor2.mostrarInformacoes(); 
        
        Aluno aluno1 = new Aluno(123456, "Matemática, História", "Lucas Andrade", "lucas.and", 1122, "lucas@example.com");
        aluno1.mostrarInformacoes();
        
        Aluno aluno2 = new Aluno(654321, "Física, Química", "Sofia Costa", "sofia.costa", 3344, "sofia@example.com");
        aluno2.mostrarInformacoes(); 
        
        Coordenador coordenador1 = new Coordenador("Engenharia", 5678, "Mariana Souza", "mariana.eng", 1357, "mariana@example.com");
        coordenador1.mostrarInformacoes(); 

        Coordenador coordenador2 = new Coordenador("Administração", 2468, "Roberto Lima", "roberto.admin", 9876, "roberto@example.com");
        coordenador2.mostrarInformacoes(); 
    }
    
}
