package aulaarraylist;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno ian = new Aluno();
        ian.setNome("Ian");
        ian.setSobrenome("Tarado");
        ian.setCurso("Analise e desenvolvimento de sistemas");
        ian.setRA("15877445");
        ian.setAnoIngresso(2023);
        ian.setPrevisaoTermino(2026);
        
        
        Aluno baralha = new Aluno();
        baralha.setNome("Baralha");
        baralha.setSobrenome("Bigodudo");
        baralha.setCurso("Analise e desenvolvimento de sistemas");
        baralha.setRA("12247945");
        baralha.setAnoIngresso(2023);
        baralha.setPrevisaoTermino(2026);
        
        
        Aluno lewandowski = new Aluno();
        lewandowski.setNome("Robert");
        lewandowski.setSobrenome("Lewandowski");
        lewandowski.setCurso("Tecnico Futebol");
        lewandowski.setRA("46898142");
        lewandowski.setAnoIngresso(1996);
        lewandowski.setPrevisaoTermino(2023);
        
        ArrayList<Aluno> lista = new ArrayList();      
        lista.add(ian);
        lista.add(baralha);
        lista.add(lewandowski);
        
        for(Aluno aux : lista){
            System.out.println("Nome e Sobrenome: "+aux.getNome()+" "+ aux.getSobrenome());
            System.out.println("Curso: "+aux.getCurso());
            System.out.println("RA: "+aux.getRA());
            System.out.println("Ano Ingresso: "+aux.getAnoIngresso() + "\nAno de Termino: "+aux.getPrevisaoTermino());
            System.out.println("\n\n\n");
        }
        
        
    }
}
