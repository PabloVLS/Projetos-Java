

package com.mycompany.prj_padrao_singleton;

/**
 *
 * @author Pablo
 */
public class Prj_Padrao_Singleton {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.situation();
        
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler2.situation();
    }
}
