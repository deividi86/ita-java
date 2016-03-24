package com.ita.week4;

import java.util.HashMap;

/**
 * Created by deividi.silva on 18/03/2016.
 */
public class ShoppingCart {

    public HashMap<Product,Integer> addedProducts = new HashMap<>();

    public void addProduct(Product product, Integer quantity){
        if(quantity <= 0){
            return;
        }
        if(addedProducts.containsKey(product)){
            addedProducts.put(product, addedProducts.get(product) + quantity);
        } else {
            addedProducts.put(product, quantity);
        }
    }

    public void removeProduct(Product product, Integer quantity){
        if(addedProducts.get(product) > quantity){
            addedProducts.put(product, addedProducts.get(product) - quantity);
        } else {
            addedProducts.entrySet().remove(product);
        }
    }

    public float calculateTotal(){
        float cartTotal = 0f;
        for(Product p : addedProducts.keySet()){
            cartTotal += addedProducts.get(p) * p.getPrice();
        }
        return cartTotal;
    }
}
