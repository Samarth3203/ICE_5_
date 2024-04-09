/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzashop;

/**
 *
 * @author samar
 */
public class PizzaBuilder {
    
    private final Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder addCheese() {
        pizza.addTopping("cheese");
        return this;
    }

    public PizzaBuilder addPepperoni() {
        pizza.addTopping("pepperoni");
        return this;
    }

    public Pizza build() {
        return pizza;
    }
    
    
}
