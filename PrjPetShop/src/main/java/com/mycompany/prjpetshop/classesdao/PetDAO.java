
package com.mycompany.prjpetshop.classesdao;

import com.mycompany.prjpetshop.objetos.Pessoa;
import com.mycompany.prjpetshop.objetos.Pet;
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
 * @author IFTM
 */
public class PetDAO {
    Connection conn;
    ManipulaData md;

    public PetDAO(Connection conn, ManipulaData md) {
        this.conn = conn;
        this.md = md;
    }

    /*public PetDAO() {
    }*/
    
    public Pet salvar(Pet p){
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pet(nome, especie , raca, porte , cor, data_nascimento , idpessoa) VALUES (?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEspecie());
            stmt.setString(3, p.getRaça());
            stmt.setString(4, p.getPorte());
            stmt.setString(5, p.getCor());
            stmt.setDate(6, md.string2Date(p.getDataNascimento()));
            stmt.setInt(7,p.getP().getIdPessoa());
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
            
                p.setIdPet(rs.getInt("idpet"));
                
            }else{
            
                p.setIdPet(-1);
            
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
    
    public ArrayList<Pessoa> listarNomes(String nome){
        ArrayList<Pessoa> pessoa = new ArrayList();
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT idpessoa, nome FROM Pessoa WHERE LOWER(nome) LIKE ?");
            stmt.setString(1, nome.toLowerCase() + "%");
            ResultSet rs =stmt.executeQuery();
            while(rs.next()){
                Pessoa p= new Pessoa();
                p.setIdPessoa(rs.getInt("idpessoa"));
                p.setNome(rs.getString("nome"));
                pessoa.add(p);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return pessoa;
    }
    
   public int pegarIdPorNome(String nome){
        int id = -1;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT idpessoa FROM Pessoa WHERE LOWER(nome) = ?");
            stmt.setString(1, nome.toLowerCase());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idpessoa");
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }
   
   
     public ArrayList<Pet> listarNomesPet(String nome){
        ArrayList<Pet> pet = new ArrayList();
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT idpet, nome FROM Pet WHERE LOWER(nome) LIKE ?");
            stmt.setString(1, nome.toLowerCase() + "%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Pet p= new Pet();
                p.setIdPet(rs.getInt("idpet"));
                p.setNome(rs.getString("nome"));
                pet.add(p);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return pet;
    }
    
   public int pegarIdPorNomePet(String nome){
        int id = -1;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT idpet FROM Pet WHERE LOWER(nome) = ?");
            stmt.setString(1, nome.toLowerCase());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idpet");
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }
    
     public List<Pet> getPets(String nome){
        List<Pet> lstPet= new ArrayList<>();
        ResultSet rs;
        try{
            PreparedStatement ppStmt= conn.prepareStatement("SELECT * FROM pet WHERE nome LIKE ?");
            ppStmt.setString(1, nome+"%");
            rs = ppStmt.executeQuery();
            while(rs.next()){
                lstPet.add(getPet(rs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lstPet;
    }
    
    public Pet getPet(ResultSet rs)throws SQLException{  
        Pet p = new Pet();
        p.setIdPet(rs.getInt("idpet"));
        p.setNome(rs.getString("nome"));
        p.setEspecie(rs.getString("especie"));
        p.setRaça(rs.getString("raca"));
        p.setDataNascimento((md.date2String(rs.getString("data_nascimento"))));
        p.setCor(rs.getString("cor"));
        p.setPorte(rs.getString("porte"));
        return p;
    }
    
    public void excluir(int id){
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Pet WHERE idpet = ?");
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
