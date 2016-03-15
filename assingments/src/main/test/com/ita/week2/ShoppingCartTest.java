package com.ita.week2;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Created by deividi.silva on 09/03/2016.
 */
public class ShoppingCartTest {

    private ShoppingCart shoppingCart = new ShoppingCart();
    private Pizza p = new Pizza();
    private Pizza p2 = new Pizza();
    private Pizza p3 = new Pizza();

    @Before
    public void setup(){
        shoppingCart.pizzas.clear();
    }

    @Test
    public void testAddEmptyPizzaToCart(){
        shoppingCart.addToCart(p);
        assertThat(true, equalTo(shoppingCart.pizzas.isEmpty()));
    }

    @Test
    public void testAddPizzaToCart(){
        p.addIngredient("queijo");
        shoppingCart.addToCart(p);
        assertThat(1, equalTo(shoppingCart.pizzas.size()));
    }

    @Test
    public void testOnePizzaTotal(){
        p.addIngredient("queijo");
        shoppingCart.addToCart(p);
        assertThat(15, equalTo(shoppingCart.pizzaTotal()));
    }

    @Test
    public void testTwoPizzasTotal(){
        p.addIngredient("queijo");
        p2.addIngredient("cebola");
        p2.addIngredient("pimenta");
        p2.addIngredient("orégano");
        p2.addIngredient("calabresa");
        p2.addIngredient("pepperoni");
        shoppingCart.addToCart(p);
        shoppingCart.addToCart(p2);
        assertThat(35, equalTo(shoppingCart.pizzaTotal()));
    }

    @Test
    public void testThreePizzasTotal(){
        p.addIngredient("queijo");
        p2.addIngredient("cebola");
        p2.addIngredient("pimenta");
        p2.addIngredient("orégano");
        p2.addIngredient("calabresa");
        p2.addIngredient("pepperoni");
        p2.addIngredient("provolone");
        p3.addIngredient("bacon");
        p3.addIngredient("milho");
        p3.addIngredient("queijo");
        shoppingCart.addToCart(p);
        shoppingCart.addToCart(p2);
        shoppingCart.addToCart(p3);
        assertThat(58, equalTo(shoppingCart.pizzaTotal()));
    }

}
