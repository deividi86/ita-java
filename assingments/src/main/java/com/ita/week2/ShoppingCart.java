package com.ita.week2;

import java.util.List;

/**
 * Created by Deividi on 01/03/2016.
 */
public class ShoppingCart {

    private static List<Pizza> pizzas;

    public ShoppingCart(List<Pizza> pizzas){
        this.pizzas = pizzas;
    }

    public static Integer pizzaTotal(){
        Integer totalPrice = 0;
        for(int i =0; i < pizzas.size(); i++){
            totalPrice += pizzas.get(i).getPrice();
        }
        return totalPrice;
    }

}
