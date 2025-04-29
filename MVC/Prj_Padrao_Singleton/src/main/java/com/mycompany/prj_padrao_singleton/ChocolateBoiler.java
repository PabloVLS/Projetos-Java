package com.mycompany.prj_padrao_singleton;

/**
 *
 * @author Pablo
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;
    
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    
    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of chocolate boiler");
        return uniqueInstance;
    }
    
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }
    
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }
    
    public boolean isEmpty(){
        return empty;
    }
    
    public boolean isBoiled(){
        return boiled;
    }
    
    public void situation(){
        System.out.println("Empty: "+String.valueOf(empty)+" Boiled: "+String.valueOf(boiled));
    }
}