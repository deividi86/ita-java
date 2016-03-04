package com.ita.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by deividi.silva on 04/03/2016.
 */
public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> allIngredients = new HashMap<>();
        Pizza p1 = new Pizza();
        p1.addIngredient("mussarela");
        p1.addIngredient("presunto");
        p1.addIngredient("azeitona");

        Pizza p2 = new Pizza();
        p2.addIngredient("calabresa");
        p2.addIngredient("mussarela");
        p2.addIngredient("cebola");
        p2.addIngredient("azeitona");
        p2.addIngredient("milho");

        Pizza p3 = new Pizza();
        p3.addIngredient("bacon");
        p3.addIngredient("champignon");
        p3.addIngredient("mussarela");

        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(p1);
        pizzaList.add(p2);
        pizzaList.add(p3);

        allIngredients.putAll(p1.totalIngredients);
        allIngredients.putAll(p2.totalIngredients);
        allIngredients.putAll(p3.totalIngredients);

        ShoppingCart sc = new ShoppingCart(pizzaList);

        System.out.println("Cart total= "+ sc.pizzaTotal());
        System.out.println("Ingredients used= "+ allIngredients.toString());
    }
}
