
package aulasmartphonepoo;

/**
 *
 * @author Pablo
 */
public class Principal {

    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Xiaomi", "Redmi 12c", 8, 240);
        System.out.println("Telefone 1: \nModelo:"+smartphone1.getModelo()+ "\nMarca:"+smartphone1.getMarca()+ "\nMemoria Ram:"+smartphone1.getMemoriaRAM()+ "\nHd:"+smartphone1.getHd()+"\n\n\n");
        
        Smartphone smartphone2 = new Smartphone();
        smartphone2.setModelo("Apple");
        smartphone2.setMarca("Iphone 15");
        smartphone2.setMemoriaRAM(16);
        smartphone2.setHd(256);
        
        smartphone2.Imprimir();
    }
    
}
