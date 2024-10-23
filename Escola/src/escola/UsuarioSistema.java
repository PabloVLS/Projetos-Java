package escola;

/**
 *
 * @author Pablo
 */
public class UsuarioSistema {
    private String nome;
    private String login;
    private String email;
    private int senha;

    public UsuarioSistema(String nome, String login, int senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome:"+this.nome+"\nLogin:"+this.login+"\nSenha:"+this.senha+"\nEmail:"+this.email+"\n\n\n");
    }
}
