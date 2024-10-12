package consullta;

/**
 *
 * @author Pablo
 */
public class Principal {

    public static void main(String[] args) {
        // Usado construtor
        Consulta consulta1 = new Consulta("", "", "Caminhoneiro", true);
        consulta1.imprimir();
        
        Consulta consulta2 = new Consulta("\nReinaldo Antônio do Bairro das Industrias", "04/03/1972");
        consulta2.setProfissao("Membro da Torcida Organizada Galoucura");
        consulta2.setConvenio(true);
        consulta2.imprimir();
        
        Consulta consulta3 = new Consulta("\nRonaldinho Gaucho", "08/06/1986");
        consulta3.setProfissao("Ex-Jogador de Futebol");
        consulta3.setConvenio(false);
        consulta3.imprimir();
        
        
        
        
        // Usado Getter and Setter
         Consulta consulta4 = new Consulta();
         consulta4.setNomeDoPaciente("");
         consulta4.setDataDeNascimento("");
         consulta4.setProfissao("");
         consulta4.setConvenio(false);
         consulta4.imprimir();
         
         
         Consulta consulta5 = new Consulta();
         consulta5.setNomeDoPaciente("\nJair Messias Bolsonaro");
         consulta5.setDataDeNascimento("04/04/1968");
         consulta5.setProfissao("Ex-Presidente");
         consulta5.setConvenio(true);
         consulta5.imprimir();
         
         Consulta consulta6 = new Consulta();
         consulta6.setNomeDoPaciente("Luis Inacio Lula da Silva");
         consulta6.setDataDeNascimento("08/10/1948");
         consulta6.setProfissao("Presidente");
         consulta6.setConvenio(false);
         consulta6.imprimir();
        
        
    }
    
}
