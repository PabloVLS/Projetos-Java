
package figurasgeometricas;

/**
 *
 * @author Pablo
 */
public class FigurasGeometricas {
    private double lado;
    private double altura;
    private double base;
    private double baseMaior;
    private double baseMenor;
    private String nomeFigura;
    
    // construtor Vazio
    public FigurasGeometricas(){
        
    }
    // construtor Quadrado
    public FigurasGeometricas(double lado, String nomeFigura) {
        this.lado = lado;
        this.nomeFigura = nomeFigura;
    }
    // construtor Triangulo
    public FigurasGeometricas(double altura, double base, String nomeFigura) {
        
        this.altura = altura;
        this.base = base;
        this.nomeFigura = nomeFigura;
    }
    // construtor Trapezio
    public FigurasGeometricas(double altura, double baseMaior, double baseMenor, String nomeFigura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura= altura;
        this.nomeFigura = nomeFigura;
    }
    
    public double calcularAreaFigura(String nomeFigura){
        if(nomeFigura.equals("quadrado")){
            double figuraCalculada = this.lado * this.lado;
            return figuraCalculada;        
        }else if(nomeFigura.equals("triangulo")){
            double figuraCalculada =  (this.base * this.altura) / 2;
            return figuraCalculada;
        }else if(nomeFigura.equals("trapezio")){
            double figuraCalculada = ((this.baseMaior + this.baseMenor) * this.altura) / 2;
            return figuraCalculada;
        }
        return 0.0;
    }
    
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado<=0){
            lado=1;
        }
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura<=0){
            altura=1;
        }
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base<=0){
            base=1;
        }
        this.base = base;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        if(baseMaior<=0){
            baseMaior=1;
        }
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        if(baseMenor<=0){
            baseMenor=1;
        }
        this.baseMenor = baseMenor;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
}
