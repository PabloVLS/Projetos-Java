package prj_ListaDeCompras_DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import prj_ListaDeCompras_Objeto.Pessoa;
import prj_ListaDeCompras_Utilitarios.Conexao;
import prj_ListaDeCompras_Utilitarios.ManipulaData;

/**
 *
 * @author Pablo
 */
public class PessoaDAO {
    ManipulaData md = ManipulaData.getInstancia();
    Connection conn = Conexao.getInstancia().getConexao();
    public PessoaDAO() {
    }
    
    public Pessoa salvar(Pessoa p){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa(nome,cpf,datanascimento)VALUES(?,?,?)",java.sql.Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getDataNascimento()));
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                p.setId(rs.getInt("id"));
            }else{
                p.setId(-1);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }
    
    public Pessoa editar(Pessoa p){
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE pessoa SET nome = ? , cpf = ? , datanascimento = ? WHERE id = ? ");
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getDataNascimento()));
            stmt.setInt(4, p.getId());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }
}
