package com.ita.week2;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Deividi on 07/03/2016.
 */
public class PizzaTest {

	@Test
	public void testAddIngredient() throws Exception {
		Pizza p = new Pizza();
		p.addIngredient("calabresa");

		assertThat(1, equalTo(p.ingredients.size()));
	}

	@Test
	public void testGetPrice() throws Exception {

	}
}
