package atividadearraylist1;
import atividadearraylist1.Zoologico;



public class Principal {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();
 
        zoologico.getMamiferos().add("Rato");
        zoologico.getMamiferos().add("Ornitorrinco");
        zoologico.getMamiferos().add("Girafa");
        zoologico.getMamiferos().add("Macaco");
        zoologico.getMamiferos().add("Tigre");

        zoologico.getPeixes().add("Pirarucu");
        zoologico.getPeixes().add("Dory");
        zoologico.getPeixes().add("Bob Esponja");
        zoologico.getPeixes().add("Piranha");
        zoologico.getPeixes().add("Blastoise");

        zoologico.getAves().add("Águia");
        zoologico.getAves().add("Urubu");
        zoologico.getAves().add("Pardal");
        zoologico.getAves().add("Corvo");
        zoologico.getAves().add("Peru");


        System.out.println("Total de animais no Zoológico: " + zoologico.getTotalDeAnimais());


        zoologico.mostrarAnimais();

        
        zoologico.excluirAves();


        zoologico.mostrarAnimais();


        zoologico.verificarEAdicionarPelicano();


        zoologico.mostrarAnimais();
    }
}
