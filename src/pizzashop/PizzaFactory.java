/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that creates different kinds of pizzas
 * depending on their type.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
class PizzaFactory 
{
    private final List<String> toppings = new ArrayList<>();

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public List<String> getToppings() {
        return toppings;
    }

    Pizza createPizza(String type) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
