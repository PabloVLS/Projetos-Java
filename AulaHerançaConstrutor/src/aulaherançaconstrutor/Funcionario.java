package aulaherançaconstrutor;

/**
 *
 * @author Pablek
 */
public class Funcionario {
    private String primeiroNome;
    private String segundoNome;
    private double salario;

    public Funcionario(String primeiroNome, String segundoNome, double salario) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.salario = salario;
    } 
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public double getSalario() {
        return salario;
    }

    

    
}
