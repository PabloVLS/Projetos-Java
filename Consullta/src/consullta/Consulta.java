package consullta;

/**
 *
 * @author Pablo
 */
public class Consulta {
    private  String nomeDoPaciente;
    private  String dataDeNascimento ;
    private  String profissao;
    private  boolean convenio = false;

    public Consulta() {
        
    }

    public Consulta(String nomeDoPaciente, String dataDeNascimento, String profissao, boolean convenio) {
        
        if (dataDeNascimento == null || dataDeNascimento.equals("")) {
            this.dataDeNascimento = "Sem preenchimento";
        } else {
            this.dataDeNascimento = dataDeNascimento;
        }
        
        
        if (profissao == null || profissao.equals("")) {
            this.profissao = "Sem preenchimento";
        } else {
            this.profissao = profissao;
        }
        
        
        if (nomeDoPaciente == null || nomeDoPaciente.equals("")) {
            this.nomeDoPaciente = "Sem preenchimento";
        } else {
            this.nomeDoPaciente = nomeDoPaciente;
        }
        
    }
    
    public Consulta(String nomeDoPaciente, String dataDeNascimento) {
        
        this.nomeDoPaciente = nomeDoPaciente;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getNomeDoPaciente() {
        return nomeDoPaciente;
    }

    public void setNomeDoPaciente(String nomeDoPaciente) {
        if (nomeDoPaciente == null || nomeDoPaciente.equals("")) {
            this.nomeDoPaciente = "Sem preenchimento";
        } else {
            this.nomeDoPaciente = nomeDoPaciente;
        }
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        if (dataDeNascimento == null || dataDeNascimento.equals("")) {
            this.dataDeNascimento = "Sem preenchimento";
        } else {
            this.dataDeNascimento = dataDeNascimento;
        }
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        if (profissao == null || profissao.equals("")) {
            this.profissao = "Sem preenchimento";
        } else {
            this.profissao = profissao;
        }
    }
   public String getConvenio() {
       if(this.convenio == true){
            return "Sim";
       }else{
           return "Não";
       }
    }
    
    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }
    
    public void imprimir(){
        System.out.println("\nNome: "+getNomeDoPaciente());
        System.out.println("Data de Nascimento: "+getDataDeNascimento());
        System.out.println("Profissão: "+getProfissao());
        System.out.println("Convenio: "+getConvenio());
    }
    
}
