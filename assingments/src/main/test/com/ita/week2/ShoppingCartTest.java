package com.ita.week2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Created by deividi.silva on 09/03/2016.
 */
public class ShoppingCartTest {

    @Test
    public void testAddToCart() throws Exception {
        ShoppingCart cart = new ShoppingCart();
        Pizza p = new Pizza();
        p.addIngredient("queijo");
        cart.addToCart(p);
        assertThat(2, equalTo(cart.pizzas.size()));
    }

    @Test
    public void testAddEmptyPizzaToCart() throws Exception {
        ShoppingCart cart = new ShoppingCart();
        Pizza p = new Pizza();
        cart.addToCart(p);
        assertThat(0, equalTo(cart.pizzas.size()));
    }

    @Test
    public void testPizzaTotalNoPizza() throws Exception {
        ShoppingCart cart = new ShoppingCart();
        assertThat(0, equalTo(cart.pizzaTotal()));
    }

    @Test
    public void testPizzaTotalOneIngredient() throws Exception {
        ShoppingCart cart = new ShoppingCart();
        Pizza p = new Pizza();
        p.addIngredient("queijo");
        cart.addToCart(p);
        assertThat(15, equalTo(cart.pizzaTotal()));
    }

}
