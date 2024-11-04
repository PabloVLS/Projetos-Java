package aulapolimorfismo;

/**
 *
 * @author Pablo
 */
public class Personalidade {
    public String falar(){
        return "...";
    }
    
    public void acionarFala(Personalidade obj){
        System.out.println(obj.falar());
    }
    
}
