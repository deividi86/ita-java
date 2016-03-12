package com.ita.week2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Created by deividi.silva on 09/03/2016.
 */
public class ShoppingCartTest {

    private Pizza pizza = new Pizza();

    @Before
    public void setup() {
        pizza.addIngredient("provolone");
    }

    @Test
    public void testAddToCart() throws Exception {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(pizza);

        assertThat(1, equalTo(cart.pizzas.size()));
    }

    @Test
    public void testPizzaTotal() throws Exception {

    }
}
