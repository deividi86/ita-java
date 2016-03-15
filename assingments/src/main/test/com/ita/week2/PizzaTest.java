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
		p.resetIngredients();
	}

	@Test
	public void testPriceWithNoIngredient() throws Exception {
		assertThat(0, equalTo(p.getPrice()));
	}

	@Test
	public void testPriceWithOneIngredient() throws Exception {
		p.addIngredient("queijo");
		assertThat(15, equalTo(p.getPrice()));
	}

	@Test
	public void testAddTwoIngredients() throws Exception {
		p.addIngredient("queijo");
		p.addIngredient("cebola");
		assertThat(15, equalTo(p.getPrice()));
	}

	@Test
	public void testAddThreeIngredients() throws Exception {
		p.addIngredient("queijo");
		p.addIngredient("cebola");
		p.addIngredient("calabresa");
		assertThat(20, equalTo(p.getPrice()));
	}

	@Test
	public void testAddFourIngredients() throws Exception {
		p.addIngredient("queijo");
		p.addIngredient("cebola");
		p.addIngredient("calabresa");
		p.addIngredient("milho");
		assertThat(20, equalTo(p.getPrice()));
	}

	@Test
	public void testAddFiveIngredients() throws Exception {
		p.addIngredient("queijo");
		p.addIngredient("cebola");
		p.addIngredient("calabresa");
		p.addIngredient("milho");
		p.addIngredient("manjericão");
		assertThat(20, equalTo(p.getPrice()));
	}

	@Test
	public void testAddSixIngredients() throws Exception {
		p.addIngredient("queijo");
		p.addIngredient("cebola");
		p.addIngredient("calabresa");
		p.addIngredient("milho");
		p.addIngredient("manjericão");
		p.addIngredient("tomate");
		assertThat(23, equalTo(p.getPrice()));
	}

	@Test
	public void testAddIngredient() throws Exception {
		p.addIngredient("tomate");
		assertThat(1, equalTo(p.ingredients.size()));
	}
}
