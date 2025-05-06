package com.mycompany.prj_padrao_factory;

/**
 *
 * @author Pablo
 */
public class CheesePizza extends Pizza{
    
    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinata Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
