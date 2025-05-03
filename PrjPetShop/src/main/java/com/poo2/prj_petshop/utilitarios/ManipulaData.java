package com.poo2.prj_petshop.utilitarios;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Pablo
 */
public class ManipulaData {
    
    private static ManipulaData instancia;
    
    private ManipulaData(){}
    
    public static ManipulaData getInstancia(){
        if(instancia == null){
            instancia = new ManipulaData();
        }
        return instancia;
    }
    
    public Date string2Date(String data){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Date dataSaida = Date.valueOf(LocalDate.parse(data,formato));
        return dataSaida;
    
    }
    
    public String date2String(String data){
        try{
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            data = new SimpleDateFormat("dd/MM/yyyy").format(date);
        }
        
        catch(ParseException ex){
            System.out.println(ex);
        }
        return data;
    
    }
    
}