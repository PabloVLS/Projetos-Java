
package com.mycompany.prjpetshop.classesbo;

import com.mycompany.prjpetshop.classesdao.PetDAO;
import com.mycompany.prjpetshop.objetos.Pessoa;
import com.mycompany.prjpetshop.objetos.Pet;
import com.mycompany.prjpetshop.utillitarios.ManipulaData;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class PetBO {
    PetDAO peBO;
    public PetBO(Connection conn, ManipulaData md){
        peBO = new PetDAO(conn,md);
    }
    
    public Pet salvar(Pet p){
        return peBO.salvar(p);
    }
    
    public ArrayList<Pessoa> listarNome(String letra){
        return peBO.listarNomes(letra);
    }
    
    public int pegarIdPorNome(String nome){
        return peBO.pegarIdPorNome(nome);
    }
    
    /*public ArrayList<Pet> listarNomesPet(String nome){
        return peBO.listarNomesPet(nome);
    }
    */
    public int pegarIdPorNomePet(String nome){
        return peBO.pegarIdPorNomePet(nome);
    }
    
    public List<Pet> getPets(String nome){
        return peBO.getPets(nome);
    }
    
    public void excluirPet(int idPet){
        peBO.excluir(idPet);
    }
}
