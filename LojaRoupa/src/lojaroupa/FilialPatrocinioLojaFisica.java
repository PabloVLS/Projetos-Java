package lojaroupa;

/**
 *
 * @author Pablo
 */
public class FilialPatrocinioLojaFisica extends ItemRoupa {
    private String gerente;
    private String endereco;

    public FilialPatrocinioLojaFisica(String gerente, String endereco, String descricao, double valor) {
        super(descricao, valor);
        this.gerente = gerente;
        this.endereco = endereco;
    }
     
    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public void devolver() {
        setDisponivel(true); 
        System.out.println("A devolução foi realizada com sucesso. O item está disponível novamente.");
    }
    
    @Override
    public void emprestar() {
        if (isDisponivel()) {
            System.out.println("O item está disponível para empréstimo. Retire-o no endereço: " + endereco);
            setDisponivel(false);  
        } else {
            System.out.println("O item não está disponível no momento.");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Gerente: " + gerente + ", Endereço: " + endereco;
    }
    
}
