package aulapolimorfismo;

/**
 *
 * @author Pablo
 */
public class PersonalidadeClasseConcreta {
    public String falar(){
        return "...";
    }
    
    public void acionarFala(PersonalidadeClasseConcreta obj){
        System.out.println(obj.falar());
    }
    
}
