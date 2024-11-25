package atividadearraylist2;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Principal {

    
    public static void main(String[] args) {
        Aluno ana = new Aluno("Ana", "São Paulo", "Universidade X", "ADS");
        Aluno paulo = new Aluno("Paulo", "São Paulo", "Universidade X", "ADS");
        Aluno rebeca = new Aluno("Rebeca", "São Paulo", "Universidade X", "ADS");
        Aluno marcos = new Aluno("Marcos", "São Paulo", "Universidade X", "ADS");
        Aluno lucas = new Aluno("Lucas", "São Paulo", "Universidade X", "ADS");
        Aluno clara = new Aluno("Clara", "São Paulo", "Universidade X", "ADS");
        Aluno pedro = new Aluno("Pedro", "São Paulo", "Universidade X", "ADS");
        Aluno juliana = new Aluno("Juliana", "São Paulo", "Universidade X", "ADS");
        
        // Alunos do curso "EE"
        Aluno fabio = new Aluno("Fabio", "São Paulo", "Universidade X", "EE");
        Aluno bela = new Aluno("Bela", "São Paulo", "Universidade X", "EE");
        Aluno renato = new Aluno("Renato", "São Paulo", "Universidade X", "EE");
        Aluno carla = new Aluno("Carla", "São Paulo", "Universidade X", "EE");
        Aluno gabriel = new Aluno("Gabriel", "São Paulo", "Universidade X", "EE");
        Aluno roberto = new Aluno("Roberto", "São Paulo", "Universidade X", "EE");
        Aluno fernanda = new Aluno("Fernanda", "São Paulo", "Universidade X", "EE");
        Aluno rafael = new Aluno("Rafael", "São Paulo", "Universidade X", "EE");
        
        ArrayList<Aluno> ads = new ArrayList();
        ads.add(ana);
        ads.add(paulo);
        ads.add(rebeca);
        ads.add(marcos);
        ads.add(lucas);
        ads.add(clara);
        ads.add(pedro);
        ads.add(juliana);

        // Adicionando alunos do curso "EE" à lista 'ee'
        ArrayList<Aluno> ee = new ArrayList();
        ee.add(fabio);
        ee.add(bela);
        ee.add(renato);
        ee.add(carla);
        ee.add(gabriel);
        ee.add(roberto);
        ee.add(fernanda);
        ee.add(rafael);

        // Mostrando a quantidade de alunos em cada curso
        System.out.println("Quantidade de alunos no curso de ADS: " + ads.size());
        System.out.println("Quantidade de alunos no curso de EE: " + ee.size());

         // Exibindo nome e cidade dos alunos do curso "ADS"
         System.out.println("Alunos do Curso de ADS");
         for(Aluno aluno : ads){
             aluno.exibirNomeECidade();
         }
         
         // Exibindo nome e cidade dos alunos do curso "EE"
         System.out.println("Alunos do Curso de EE");
         for(Aluno aluno : ee){
             aluno.exibirNomeECidade();
         }
        
    }
    
}
