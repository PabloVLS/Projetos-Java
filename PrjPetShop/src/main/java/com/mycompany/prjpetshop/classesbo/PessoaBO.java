
package com.mycompany.prjpetshop.classesbo;

import com.mycompany.prjpetshop.classesdao.PessoaDAO;
import com.mycompany.prjpetshop.objetos.Pessoa;
import com.mycompany.prjpetshop.objetos.Pet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFTM
 */
public class PessoaBO {
    PessoaDAO pDAO;
    public PessoaBO(){
        pDAO = new PessoaDAO();
    }
    
    public Pessoa salvar (Pessoa p){
        return pDAO.salvar(p);
    }
    
    public List<Pessoa> getPessoas(String nome){
        return pDAO.getPessoas(nome);
    }
    
    public Pessoa editPessoas(Pessoa p){
        return pDAO.editPessoas(p);
    }
    
    public void excluirPessoa(int idDono){
        pDAO.excluir(idDono);
    }
}
