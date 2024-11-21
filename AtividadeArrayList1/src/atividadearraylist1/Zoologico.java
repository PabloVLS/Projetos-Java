package atividadearraylist1;

import java.util.ArrayList;

public class Zoologico {
    
    
    private ArrayList<String> mamiferos;
    private ArrayList<String> peixes;
    private ArrayList<String> aves;


    public Zoologico() {
        mamiferos = new ArrayList<>();
        peixes = new ArrayList<>();
        aves = new ArrayList<>();
    }

    public ArrayList<String> getMamiferos() {
        return mamiferos;
    }

    public void setMamiferos(ArrayList<String> mamiferos) {
        this.mamiferos = mamiferos;
    }


    public ArrayList<String> getPeixes() {
        return peixes;
    }

    public void setPeixes(ArrayList<String> peixes) {
        this.peixes = peixes;
    }

    public ArrayList<String> getAves() {
        return aves;
    }

    public void setAves(ArrayList<String> aves) {
        this.aves = aves;
    }


    public int getTotalDeAnimais() {
        return mamiferos.size() + peixes.size() + aves.size();
    }

    public void mostrarAnimais() {
        System.out.println("Mamíferos:");
        for (String mamifero : mamiferos) {
            System.out.println(mamifero);
        }
        System.out.println("\n**********************************\n");
        System.out.println("Peixes:");
        for (String peixe : peixes) {
            System.out.println(peixe);
        }
        System.out.println("\n**********************************\n");
        System.out.println("Aves:");
        for (String ave : aves) {
            System.out.println(ave);
        }
        System.out.println("\n");
    }
    

    public void excluirAves() {
        if (aves.size() >= 2) {
            System.out.println("\nExclui duas aves\n\n");
            aves.remove(0);
            aves.remove(1);
        } else {
            System.out.println("Não tem aves suficientes para excluir.\n");
        }
    }

    public void verificarEAdicionarPelicano() {
        if (!aves.contains("Pelicano")) {
            aves.add("Pelicano");
            System.out.println("Pelicano adicionado às aves.");
        } else {
            System.out.println("O Zoológico já possui um Pelicano.");
        }
    }
}