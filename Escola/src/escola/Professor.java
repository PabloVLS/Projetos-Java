package escola;

public class Professor {

    private String nome;
    private String materia;
    private int horario;

    public Professor(String nome, String materia, int horario) {
        this.nome = nome;
        this.materia = materia;
        this.horario = horario;
    }

    
    
    
    
    
    public void ensinar() {

    }

    public void darPresenca() {

    }

    public void darAtividades() {

    }

    public void Chegada() {

    }
    public void Saida() {

    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    
    public String getMateria(){
        return this.materia;
    }
    public void setMateria(String m){
        this.materia = m;
    }
    
    
    public int getHorario(){
        return this.horario;
    }
    public void setHorario(int h){
        this.horario = h;
    }
      
    public void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matéria: "+ this.getMateria());
        System.out.println("Horário: "+ this.getHorario() );
    }
    
}
