package escola;

/**
 *
 * @author Pablo
 */
public class Coordenador extends UsuarioSistema{
    private String curso;
    private int senhaMPlan;

    public Coordenador(String curso, int senhaMPlan, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        this.curso = curso;
        this.senhaMPlan = senhaMPlan;
    }
    
    


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSenhaMPlan() {
        return senhaMPlan;
    }

    public void setSenhaMPlan(int senhaMPlan) {
        this.senhaMPlan = senhaMPlan;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome:"+getNome()+"\nLogin:"+getLogin()+"\nSenha:"+getSenha()+"\nEmail:"+getEmail()+"\nSiape:"+this.curso+"\nNucleo:"+this.senhaMPlan+"\n\n\n");
    }
    
}
