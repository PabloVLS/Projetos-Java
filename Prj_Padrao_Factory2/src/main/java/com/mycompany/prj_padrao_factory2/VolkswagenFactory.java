package com.mycompany.prj_padrao_factory2;

/**
 *
 * @author IFTM
 */
public class VolkswagenFactory implements CarFactory{
    @Override
    public Car createCar(){
        return new Polo();
    }
}
