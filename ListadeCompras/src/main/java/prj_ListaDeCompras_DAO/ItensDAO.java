package prj_ListaDeCompras_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import prj_ListaDeCompras_Objeto.Itens;
import prj_ListaDeCompras_Utilitarios.Conexao;
import prj_ListaDeCompras_Utilitarios.ManipulaData;

/**
 *
 * @author Pablo
 */
public class ItensDAO {

    Connection conn = Conexao.getInstancia().getConexao();
    ManipulaData md = ManipulaData.getInstancia();
    public ItensDAO() {
    }

    
    
    public Itens salvar(Itens i) {
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO itens(nome, quantidade, valorunitario , datacompra, id_pessoa) VALUES(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, i.getNome());
            stmt.setInt(2, i.getQuantidade());
            stmt.setDouble(3, i.getValorUnitario());
            stmt.setDate(4, md.string2Date(i.getDataCompra()));
            stmt.setInt(5, i.getId_pessoa());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                i.setId(rs.getInt("id"));
            }else{
                i.setId(-1);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return i;
    }

    public List<Itens> listar(Itens i) {
        List<Itens> lista= new ArrayList<>();
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ITENS WHERE id_pessoa = ?");
            stmt.setInt(1, i.getId_pessoa());
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Itens item = new Itens();
                item.setId(rs.getInt("id"));
                item.setNome(rs.getString("nome"));
                item.setQuantidade(rs.getInt("quantidade"));
                item.setValorUnitario(rs.getDouble("valorunitario"));
                item.setDataCompra(md.date2String(rs.getString("datacompra")));
                item.setId_pessoa(rs.getInt("id_pessoa"));
                lista.add(item);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lista;
    }

    public Itens editar(Itens i) {
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE itens SET nome = ? , quantidade = ? , valorunitario = ? , datacompra = ? WHERE id_pessoa = ?");
            stmt.setString(1, i.getNome());
            stmt.setInt(2, i.getQuantidade());
            stmt.setDouble(3, i.getValorUnitario());
            stmt.setDate(4, md.string2Date(i.getDataCompra()));
            stmt.setInt(5, i.getId_pessoa());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return i;
    }
    
    public Itens excluir(Itens i){
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM itens  WHERE id = ?");
            stmt.setInt(1, i.getId());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return i;
    }

}
