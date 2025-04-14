
package com.mycompany.prjpetshop.classesdao;

import com.mycompany.prjpetshop.objetos.Pessoa;
import com.mycompany.prjpetshop.utillitarios.Conexao;
import com.mycompany.prjpetshop.utillitarios.ManipulaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class PessoaDAO {
    Connection conn;
    ManipulaData md;
    
    public PessoaDAO(){
        conn = new Conexao().conectar();
        md = new ManipulaData();
           
    }
    
    public Pessoa salvar(Pessoa p){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa(nome, cpf, data_nascimento) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getDataNascimento()));
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                p.setIdPessoa(rs.getInt("idpessoa"));
            }else{
                p.setIdPessoa(-1);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }
    
    public List<Pessoa> getPessoas(String nome){
        List<Pessoa> lstP= new ArrayList<>();
        ResultSet rs;
        try{
            PreparedStatement ppStmt= conn.prepareStatement("SELECT * FROM pessoa WHERE nome LIKE ?");
            ppStmt.setString(1, nome+"%");
            rs = ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lstP;
    }
    
    public Pessoa getPessoa(ResultSet rs)throws SQLException{  
        Pessoa p = new Pessoa();
        p.setIdPessoa(rs.getInt("idpessoa"));
        p.setNome(rs.getString("nome"));
        p.setCpf(rs.getString("cpf"));
        p.setDataNascimento((md.date2String(rs.getString("data_nascimento"))));
        return p;
    }
    
    public Pessoa editPessoas(Pessoa p){
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE pessoa SET nome = ?,cpf = ?,data_nascimento = ? WHERE idpessoa = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getDataNascimento()));
            stmt.setInt(4, p.getIdPessoa());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }
    
    public void excluir(int id){
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE SET idpessoa = null Pessoa WHERE idpessoa = ?");
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();
            if(linhasAfetadas>0){
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel excluir!");
            }
        } catch (Exception e) {
        }
    }
}
