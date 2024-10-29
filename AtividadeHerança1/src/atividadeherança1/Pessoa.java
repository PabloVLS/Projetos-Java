package atividadeherança1;

/**
 *
 * @author Pablo
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private String dataCadastro;
    

    public Pessoa(int codigo, String nome, String dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.codigo = codigo;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", dataCadastro='" + dataCadastro + '\'' +
                '}';
    }
}
