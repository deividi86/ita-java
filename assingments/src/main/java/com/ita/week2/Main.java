package com.ita.week2;

/**
 * Created by deividi.silva on 04/03/2016.
 */
public class Main {

    public static void main(String[] args) {
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

        ShoppingCart sc = new ShoppingCart();
        sc.addToCart(p1);
        sc.addToCart(p2);
        sc.addToCart(p3);

        System.out.println("Cart total= "+ sc.pizzaTotal());
        System.out.println("Ingredients used= "+ Pizza.totalIngredients.toString());
    }

}
