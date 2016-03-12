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
    private ShoppingCart cart = new ShoppingCart();

    @Before
    public void setup() {
        pizza.addIngredient("provolone");
        cart.addToCart(pizza);
    }

    @Test
    public void testAddToCart() throws Exception {
        assertThat(2, equalTo(cart.pizzas.size()));
    }

    @Test
    public void testPizzaTotal() throws Exception {
        assertThat(15, equalTo(cart.pizzaTotal()));
    }
}
