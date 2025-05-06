package com.mycompany.prj_padrao_factory;

/**
 *
 * @author Pablo
 */
public class ClamPizza extends Pizza {
    public ClamPizza(){
        name = "Clam Pizza";
        dough = "Thin Crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
