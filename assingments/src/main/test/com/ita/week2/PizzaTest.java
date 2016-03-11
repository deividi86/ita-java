package com.ita.week2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Deividi on 07/03/2016.
 */
public class PizzaTest {

	private Pizza p = new Pizza();

	@Before
	public void setup() {
		p.addIngredient("calabresa");
		p.addIngredient("queijo");
		p.addIngredient("tomate");
		p.addIngredient("cebola");
	}

	@Test
	public void testAddIngredient() throws Exception {
		assertThat(4, equalTo(p.ingredients.size()));
	}

	@Test
	public void testGetPrice() throws Exception {
		assertThat(20, equalTo(p.getPrice()));
	}
}
