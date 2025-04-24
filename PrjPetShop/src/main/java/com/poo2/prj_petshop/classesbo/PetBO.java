package com.poo2.prj_petshop.classesbo;

import com.poo2.prj_petshop.classesDAO.PetDAO;
import com.poo2.prj_petshop.objetos.Pessoa;
import com.poo2.prj_petshop.objetos.Pet;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class PetBO {
    
    PetDAO petDAO;
    
    public PetBO(){
        petDAO = new PetDAO(); 
    }
    
    public Pet salvar(Pet pet){
        return petDAO.salvar(pet); 
    }

    public List<Pet> getPet(String nome) {
        return petDAO.consultar(nome); 
    }

    public void exc(Pet pet) {   
        petDAO.excluir(pet); 
    }

    public void edit(Pet pet) {
        petDAO.editar(pet);
    }
    
    public List<Pet> getPets(){
        return petDAO.getPets();
    }
    
    public List<Pet> getPetsNomeData(String nome, String dataInicio, String dataFim){
        return petDAO.getPetsNomeData(nome, dataInicio, dataFim);
    }
    
    public List<Pet> getPetsData(String dataInicio, String dataFim){
        return petDAO.getPetsData(dataInicio, dataFim);
    }

    public Pet getPetId(int idpet) { 
        return petDAO.getPetId(idpet); 
    }
    
}
