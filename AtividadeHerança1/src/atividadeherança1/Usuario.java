package atividadeherança1;

/**
 *
 * @author Pablo
 */
public class Usuario extends Pessoa{
    private String login;
    private String senha;

    public Usuario(int codigo, String nome, String dataCadastro, String login, String senha) {
        super(codigo, nome, dataCadastro);
        this.login = login;
        this.senha=senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return "Usuario" +
                "codigo=" + getCodigo() + // Supondo que a classe Pessoa tenha um método getCodigo()
                ", nome='" + getNome() + '\'' + // Supondo que a classe Pessoa tenha um método getNome()
                ", dataCadastro='" + getDataCadastro() + '\'' + // Supondo que a classe Pessoa tenha um método getDataCadastro()
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' + // Atenção: imprimir a senha pode não ser seguro
                '\n';
    }
}
