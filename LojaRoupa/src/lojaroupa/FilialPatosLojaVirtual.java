package lojaroupa;

/**
 *
 * @author Pablo
 */
public class FilialPatosLojaVirtual extends ItemRoupa {
    private String URL;
    private String nomeEntregador;
    private boolean statusEntregador;

    public FilialPatosLojaVirtual(String URL, String nomeEntregador, boolean statusEntregador, String descricao, double valor) {
        super(descricao, valor);
        this.URL = URL;
        this.nomeEntregador = nomeEntregador;
        this.statusEntregador = statusEntregador;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }

    public boolean isStatusEntregador() {
        return statusEntregador;
    }

    public void setStatusEntregador(boolean statusEntregador) {
        this.statusEntregador = statusEntregador;
    }
    

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            if (isStatusEntregador()) {
                System.out.println("O item "+getDescrição()+ " está disponível. E sera entregue");
                setDisponivel(false);
                setStatusEntregador(false);
            }
            System.out.println("Entregador indisponivel!");
        } else {
            System.out.println("O item não está disponível no momento.");
        }
    }

    @Override
    public void devolver() {
        if (isStatusEntregador()) {
                System.out.println("O entregador está a caminho para retirar!");
                setDisponivel(true);
                System.out.println("Devolução foi feita com sucesso.");
        } else {
            System.out.println("O item nao pode ser devolvido.");
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+ ", URL: " + URL + ", Entregador: " + nomeEntregador;
    }
    
}
