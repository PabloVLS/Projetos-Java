package com.mycompany.prj_padrao_factory2;

/**
 *
 * @author IFTM
 */
public class FiatFactory implements CarFactory{
    @Override
    public Car createCar(){
        return new Fiat_Strada();
    }
}
