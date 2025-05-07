
package prj_ListaDeCompras_Bo;

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
    
}
