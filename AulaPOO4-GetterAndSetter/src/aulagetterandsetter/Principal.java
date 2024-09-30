
package aulagetterandsetter;

/**
 *
 * @author Pablo
 */
public class Principal {

    
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.setModelo("Fusca");
        fusca.setMarca("Volkswagen");
        fusca.setAno(1973);
        System.out.println("Carro: "+fusca.getMarca()+" - " +fusca.getModelo() + "\nAno: "+fusca.getAno());
    }
    
}
