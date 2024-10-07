
package aulasmartphonepoo;

/**
 *
 * @author Pablo
 */
public class Smartphone {
    private String modelo;
    private String marca;
    private int memoriaRAM;
    private int hd;
    
    
    public Smartphone(){
        
    }

    public Smartphone(String modelo, String marca, int memoriaRAM, int hd) {
        this.modelo = modelo;
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.hd = hd;
    }

    public Smartphone(int memoriaRAM, int hd) {
        if(memoriaRAM <= 0 && hd <=0){
            this.memoriaRAM = 100;
            this.hd = 100;
        }else{
            this.memoriaRAM = memoriaRAM;
            this.hd = hd;
        }
        
    }
    
  
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if((modelo.equals("Apple"))||(modelo.equals("Samsung"))||(modelo.equals("Xiaomi")) ){
            this.modelo=modelo;
        }else{
            this.modelo="Pobretão";
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }
    
    public void Imprimir(){
        System.out.println("Telefone 2: \nModelo:"+this.modelo+ "\nMarca:"+this.marca+ "\nMemoria Ram:"+this.memoriaRAM+ "\nHd:"+this.hd);
    }
    
    
}
