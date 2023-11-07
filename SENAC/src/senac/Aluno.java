/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac;

/**
 *
 * @author 931655
 */
public class Aluno extends Pessoa
{
    private int matricula;
    private String curso;
    
    public void CancelarMatr(){
        System.out.println("Matricula "+ this.getMatricula() + " canselada !");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
