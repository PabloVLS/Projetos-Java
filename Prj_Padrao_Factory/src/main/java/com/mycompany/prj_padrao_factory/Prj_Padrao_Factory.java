package com.mycompany.prj_padrao_factory;

/**
 *
 * @author IFTM
 */
public class Prj_Padrao_Factory {

    public static void main(String[] args) {
       SimplePizzaFactory factory = new SimplePizzaFactory();
       PizzaStore store = new PizzaStore(factory);
       
       Pizza pizza = store.orderPizza("cheese");
       System.out.println("We ordered a " + pizza.getName() + "\n");
       System.out.println(pizza);
        
       pizza = store.orderPizza("veggie");
       System.out.println("We ordered a " + pizza.getName() + "\n");
       System.out.println(pizza);
        
    }
}
