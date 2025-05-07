package prj_ListaDeCompras_Bo;

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
    
}
