package com.mycompany.prj_padrao_factory;

/**
 *
 * @author IFTM
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza(){
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinata  Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Grated Parmesan");
        toppings.add("Diced Onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
