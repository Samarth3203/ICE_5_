/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents a basic pizza
 * @author dancye
 */
public class Pizza 
{
    private final List<String> toppings = new ArrayList<>();
    int bakeTemp;

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public List<String> getToppings() {
        return toppings;
    }
}
