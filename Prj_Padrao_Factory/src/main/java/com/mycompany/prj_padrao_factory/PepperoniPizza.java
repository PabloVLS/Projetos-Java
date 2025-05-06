package com.mycompany.prj_padrao_factory;

/**
 *
 * @author Pablo
 */
public class PepperoniPizza extends Pizza{
        public PepperoniPizza(){
            name = "Pepperoni Pizza";
            dough = "Crust";
            sauce = "Marinata sauce";
            toppings.add("Sliced Pepperoni");
            toppings.add("Sliced Onion");
            toppings.add("Grated parmesan cheese");
    }
}
