
package escola;



public class Escola {
    public static void main(String[] args) {
        
            Estudante estudante1 = new Estudante("Parabolas", "Ruas das bostas", 15, 8542154, "152.210.266.85");
            estudante1.imprimir();
            Professor prof1 = new Professor("Valderrama", "Educação Fisica", 15);
            prof1.imprimir();
            Curso cursin = new Curso("Educação Fisica", "Valderrama", 30, 1500);
            cursin.imprimir();
            
           
            Estudante estudante[] = new Estudante[10];
            
            estudante[0] = new Estudante("Zequinha","Rua das Safadezas",22,195214,"188.555.555-12");
            estudante[1] = new Estudante("Pereirinha","Rua das Cavalonas",24,199424,"145.333.111-16");
            estudante[3] = new Estudante("Bolinha","Rua das Gororobas",62,452214,"188.965.545-33");
            estudante[4] = new Estudante("Terezinha","Rua das Ameixas",90,331424,"145.283.111-12");
            estudante[5] = new Estudante("Pedrinho","Rua das Galinhas",23,721544,"188.051.124-40");
            estudante[6] = new Estudante("Flavinha","Rua das Endrocrinas",33,107754,"222.923.471-42");
            
    }
}
