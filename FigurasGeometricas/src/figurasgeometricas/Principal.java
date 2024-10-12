package figurasgeometricas;

/**
 *
 * @author Pablo
 */
public class Principal {
    public static void main(String[] args) {
        // Quadrado usando construtor
        FigurasGeometricas figura1 = new FigurasGeometricas(4, "quadrado");
        figura1.calcularAreaFigura("quadrado");
        System.out.println("\nFigura: " + figura1.getNomeFigura());
        System.out.println("Altura: " + figura1.getLado());
        System.out.println("Area: " + figura1.calcularAreaFigura("quadrado"));
        
        // Triangulo usando construtor
        FigurasGeometricas figura2 = new FigurasGeometricas(50, 20, "triangulo");
        figura2.calcularAreaFigura("triangulo");
        System.out.println("\nFigura: " + figura2.getNomeFigura());
        System.out.println("Altura: " + figura2.getAltura());
        System.out.println("Base: " + figura2.getBase());
        System.out.println("Area: " + figura2.calcularAreaFigura("triangulo"));
        
        
        
        
           
        // Trapezio usando Getter and Setter
        FigurasGeometricas figura3 = new FigurasGeometricas();
        figura3.setNomeFigura("trapezio");
        figura3.setBaseMaior(6);
        figura3.setBaseMenor(3);
        figura3.setAltura(4);
        figura3.calcularAreaFigura(figura3.getNomeFigura());
        System.out.println("\nFigura: " + figura3.getNomeFigura());
        System.out.println("Base Maior: " + figura3.getBaseMaior());
        System.out.println("Base Menor: " + figura3.getBaseMenor());
        System.out.println("Altura: " + figura3.getAltura());
        System.out.println("Area: " + figura3.calcularAreaFigura(figura3.getNomeFigura()));
        
        
        // Triangulo usando Getter and Setter
        FigurasGeometricas figura4 = new FigurasGeometricas();
        figura4.setNomeFigura("triangulo");
        figura4.setBase(20);
        figura4.setAltura(14);
        figura2.calcularAreaFigura(figura4.getNomeFigura());
        System.out.println("\nFigura: " + figura4.getNomeFigura());
        System.out.println("Base: " + figura4.getBase());
        System.out.println("Altura: " + figura4.getAltura());
        System.out.println("Area: " + figura4.calcularAreaFigura(figura4.getNomeFigura()));
        
       
        
        
        
        
    }
}
