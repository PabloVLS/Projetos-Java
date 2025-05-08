
package prj_ListaDeCompras_Bo;

import java.util.List;
import prj_ListaDeCompras_DAO.ItensDAO;
import prj_ListaDeCompras_Objeto.Itens;

/**
 *
 * @author Pablo
 */
public class ItensBO {
    ItensDAO itensDao;

    public ItensBO() {
       itensDao = new ItensDAO();
    }
    
    public Itens salvar(Itens i){
        return itensDao.salvar(i);
    }
    
    public List<Itens> listar(Itens i){
        return itensDao.listar(i);
    }
    
    public Itens editar(Itens i){
        return itensDao.editar(i);
    }
    
    public Itens excluir(Itens i){
        return itensDao.excluir(i);
    }
    
}
