
package projetoUFC;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    
    public void apresentar(){
        System.out.println("\n\nNome: "+ this.getNome());
        System.out.println("Nacionalidade: "+ this.getNacionalidade());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Altura: "+ this.getAltura());
        System.out.println("Peso: "+ this.getPeso());
        System.out.println("Categoria: "+ this.getCategoria()+"\n\n");
        
    }
    
    public void status(){
        System.out.println("\nVitórias: "+ this.getVitorias());
        System.out.println("Derrotas: "+ this.getDerrotas());
        System.out.println("Empates: "+ this.getEmpates()+"\n\n");
    }
    
    public void ganharLuta(){
        setVitorias(getVitorias() +1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() +1);
    }
    
    public void empatarLuta(){
        setEmpates(getEmpates() +1);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52){
            this.categoria = "Invalido";
        }else if (this.peso <= 70){
            this.categoria = "Leve";
        }else if(this.peso<= 83){
            this.categoria ="Médio";
        }else if(this.peso<= 110){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
        }
   
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
    
    
    
    
    
    
}
