package prj_ListaDeCompras_DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            //tem que arrumar pra inserir no id do cara que inserir o item
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

    public Pessoa excluir(Pessoa p) {
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM pessoa WHERE id=?");
            stmt.setInt(1, p.getId());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }
    
    public Pessoa getPessoa(ResultSet rs){
        Pessoa p = new Pessoa();
        try{
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setCpf(rs.getString("cpf"));
            p.setDataNascimento(md.date2String(rs.getString("datanascimento")));
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }

    public List<Pessoa> getPessoa(String nome) {
        List<Pessoa> lstPessoas = new ArrayList<>();
        ResultSet rs;
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pessoa WHERE nome ILIKE ?");
            stmt.setString(1, nome+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                //esse getPessoa abaixo e do metodo acima
                lstPessoas.add(getPessoa(rs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lstPessoas;
    }
}
