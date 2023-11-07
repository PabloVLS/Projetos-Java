
package escola;

public class Curso {
    
    
    private String materia;
    private String docentes;
    private  int quantidadeAlunos;
    private int cargaHoraria;

    public Curso(String materia, String docentes, int quantidadeAlunos, int cargaHoraria) {
        this.materia = materia;
        this.docentes = docentes;
        this.quantidadeAlunos = quantidadeAlunos;
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
    
  
    public void matricular(){
        
    }
    
    public void formar(){
        
    }
    
    public void capacitar(){
        
    }
    
    public String getMateria(){
        return this.materia;
    }
    public void setMateria(String m){
        this.materia =m;
    }
    
    
    public String getDocentes(){
        return this.docentes;
    }
    public void setDocentes(String d){
        this.docentes = d;
    }
    
    
    public int getQuantidadeAlunos(){
        return this.quantidadeAlunos;
    }
    public void setQuantidadeAlunos(int qd){
        this.quantidadeAlunos = qd;
    }
    
    public int getCargaHoraria(){
        return this.cargaHoraria;
    }
    public void setCargaHoraria(int ch){
        this.cargaHoraria = ch;
    }
    
     public void imprimir() {
        System.out.println("Matéria: "+ this.materia);
        System.out.println("Professores: "+this.docentes);
        System.out.println("Quantidade de alunos: "+ this.quantidadeAlunos);
        System.out.println("Carga Horária de : "+this.cargaHoraria+" horas  \n\n");
    }
    
}
