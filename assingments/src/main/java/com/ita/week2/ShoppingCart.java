package com.ita.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deividi on 01/03/2016.
 */
public class ShoppingCart {

    public static List<Pizza> pizzas = new ArrayList<>();

    public void addToCart(Pizza pizza){
        if(!pizza.ingredients.isEmpty()){
            this.pizzas.add(pizza);
        }
    }

    public static Integer pizzaTotal(){
        Integer totalPrice = 0;

        for(Pizza p : pizzas){
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

}
