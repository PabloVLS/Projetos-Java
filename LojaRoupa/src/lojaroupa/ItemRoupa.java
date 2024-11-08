
package lojaroupa;

/**
 *
 * @author Pablo
 */
public abstract class ItemRoupa {
    private String descricao;
    private double valor;
    private boolean disponivel;
    

    public ItemRoupa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.disponivel = true;
    }

    public String getDescrição() {
        return descricao;
    }

    public void setDescrição(String descricao) {
        if (!descricao.equals("calca") && !descricao.equals("jaqueta") && !descricao.equals("T-Shirt")
                && !descricao.equals("shorts") && !descricao.equals("vestido") && !descricao.equals("blusa")) {
            System.out.println("Item sem cadastro no sistema.");
            this.descricao = "sem cadastro";  
        } else {
            this.descricao = descricao;
            isDisponivel();
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor == 0) {
            this.valor = 10.00;
        } else {
            this.valor = valor;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public abstract  void emprestar();
    
    public abstract void devolver();
    
    @Override
    public String toString() {
        return super.toString()+", Descrição: " + descricao + ", Valor: " + valor + ", Disponível: " + (disponivel ? "Sim" : "Não");
    }
    
    
}
