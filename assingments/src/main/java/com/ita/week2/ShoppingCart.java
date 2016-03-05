package com.ita.week2;

import java.util.List;

/**
 * Created by Deividi on 01/03/2016.
 */
public class ShoppingCart {

    public static List<Pizza> pizzas;

    public ShoppingCart(List<Pizza> pizzas){
        this.pizzas = pizzas;
    }

    public static Integer pizzaTotal(){
        Integer totalPrice = 0;
        for(Pizza p : pizzas){
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

}
