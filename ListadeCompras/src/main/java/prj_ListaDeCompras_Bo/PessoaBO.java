package prj_ListaDeCompras_Bo;

import java.util.ArrayList;
import java.util.List;
import prj_ListaDeCompras_DAO.PessoaDAO;
import prj_ListaDeCompras_Objeto.Pessoa;

/**
 *
 * @author Pablo
 */
public class PessoaBO {
    PessoaDAO pessoaDAO;

    public PessoaBO() {
        pessoaDAO = new PessoaDAO();
    }
    
    public Pessoa salvar(Pessoa p){
        return pessoaDAO.salvar(p);
    }
    
    public Pessoa editar(Pessoa p){
        return pessoaDAO.editar(p);
    }
    
    public Pessoa excluir(Pessoa p){
        return pessoaDAO.excluir(p);
    }
    
    public List<Pessoa> getPessoa(String nome){
        return pessoaDAO.getPessoa(nome);
    }
    
}
