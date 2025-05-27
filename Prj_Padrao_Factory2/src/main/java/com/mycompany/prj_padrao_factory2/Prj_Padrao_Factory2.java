package com.mycompany.prj_padrao_factory2;

/**
 *
 * @author IFTM
 */
public class Prj_Padrao_Factory2 {

    public static void main(String[] args) {
        Car car;
        CarFactory fiatFactory = new FiatFactory();
        CarFactory volksFactory = new VolkswagenFactory();
        car = fiatFactory.createCar();
        car.showInfo();
        
        car = volksFactory.createCar();
        car.showInfo();
    }
}
