
package exemploconstruct;


public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;
    private int idade;

    
    public Pessoa(String nome, String cpf, String endereco, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade= idade;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
    
    
}
