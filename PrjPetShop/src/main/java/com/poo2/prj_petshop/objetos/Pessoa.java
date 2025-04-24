package com.poo2.prj_petshop.objetos;

import java.util.List;

/**
 *
 * @author Pablo
 */
public class Pessoa {
    private int id;
    private String nome;
    private String data_nasc;
    private String cpf;
    private List<Pet> lstPet;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Pet> getLstPet() {
        return lstPet;
    }

    public void setLstPet(List<Pet> lstPet) {
        this.lstPet = lstPet;
    }
    
}
