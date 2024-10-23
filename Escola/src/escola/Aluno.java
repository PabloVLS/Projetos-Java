package escola;

/**
 *
 * @author Pablo
 */
public class Aluno extends UsuarioSistema{
    private int RA;
    private String disciplinas;

    public Aluno(int RA, String disciplinas, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        this.RA = RA;
        this.disciplinas = disciplinas;
    }
    
    

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

   public void mostrarInformacoes(){
        System.out.println("Nome:"+getNome()+"\nLogin:"+getLogin()+"\nSenha:"+getSenha()+"\nEmail:"+getEmail()+"\nSiape:"+this.RA+"\nNucleo:"+this.disciplinas+"\n\n\n");
    }
        
}
