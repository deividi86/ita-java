package com.ita.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Deividi on 01/03/2016.
 */
public class Pizza {

	public static HashMap<String, Integer> totalIngredients = new HashMap<>();
	public List<String> ingredients = new ArrayList<>();

	public void addIngredient(String ingredient) {
		this.ingredients.add(ingredient);
		accountIngredient(ingredient);
	}

	public Integer getPrice(){
		if(ingredients.size() <= 0) {
			return 0;
		}
		if(ingredients.size() <= 2) {
			return 15;
		}
		else if(ingredients.size() >= 3 && ingredients.size() <=5 ) {
			return 20;
		}
		else {
			return 23;
		}
	}

	public static void accountIngredient(String ingredient){
		if(totalIngredients.containsKey(ingredient)){
			totalIngredients.put(ingredient,totalIngredients.get(ingredient)+1);
		} else {
			totalIngredients.put(ingredient,1);
		}
	}
}
