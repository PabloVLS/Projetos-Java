
package escola;

public class Estudante {

    private String nome;
    private String endereco;
    private int idade;
    private int matricula;
    private String cpf;

    public Estudante(String nome, String endereco, int idade, int matricula, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.matricula = matricula;
        this.cpf = cpf;
    }
    
    public void estudar() {

    }

    public void ler() {

    }

    public void falar() {

    }

    public void beberAgua() {

    }

    public void realizarProvas() {

    }

    public void realizarAtividades() {

    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    
    
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String e){
        this.endereco = e ;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int ida){
        this.idade = ida;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int ma){
        this.matricula = ma;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public void imprimir (){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Idade: "+this.idade);
        System.out.println("Matricula: "+this.matricula+"\n\n");
    }
    
    
}
