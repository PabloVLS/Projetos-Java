
package atividadeherança1;

/**
 *
 * @author 
 */
public class Cliente extends Pessoa{
    private String email;
    private String endereco;
    private String telefone;

    public Cliente(int codigo, String nome, String dataCadastro, String email, String endereco, String telefone) {
        super(codigo, nome, dataCadastro);
        this.email=email;
        this.endereco=endereco;
        this.telefone=telefone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
     @Override
    public String toString() {
        return "Cliente:" +
                "codigo=" + getCodigo() + // Supondo que a classe Pessoa tenha um método getCodigo()
                ", nome='" + getNome() + '\'' + // Supondo que a classe Pessoa tenha um método getNome()
                ", dataCadastro='" + getDataCadastro() + '\'' + // Supondo que a classe Pessoa tenha um método getDataCadastro()
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '\n';
    }
    
}
