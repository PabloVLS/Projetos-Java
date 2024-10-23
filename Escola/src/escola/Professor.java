package escola;

/**
 *
 * @author Pablo
 */
public class Professor extends UsuarioSistema{
    private int siape;
    private String nucleo;

    public Professor(int siape, String nucleo, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        this.siape = siape;
        this.nucleo = nucleo;
    }

    

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getNucleo() {
        return nucleo;
    }

    public void setNucleo(String nucleo) {
        this.nucleo = nucleo;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome:"+getNome()+"\nLogin:"+getLogin()+"\nSenha:"+getSenha()+"\nEmail:"+getEmail()+"\nSiape:"+this.siape+"\nNucleo:"+this.nucleo+"\n\n\n");
    }
}
