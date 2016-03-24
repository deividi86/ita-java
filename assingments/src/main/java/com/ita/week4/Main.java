package com.ita.week4;

/**
 * Created by deividi.silva on 04/03/2016.
 */
public class Main {

    public static void main(String[] args) {
        ProductWithSize p1 = new ProductWithSize();
        p1.setCode("A");
        p1.setName("Calça jeans");
        p1.setPrice(10.0f);
        p1.setSize(1);

        ProductWithSize p2 = new ProductWithSize();
        p2.setCode("A");
        p2.setName("Calça jeans");
        p2.setPrice(10.0f);
        p2.setSize(3);

        ProductWithSize p3 = new ProductWithSize();
        p3.setCode("A");
        p3.setName("Calça jeans");
        p3.setPrice(10.0f);
        p3.setSize(3);

        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(p1,2);
        sc.addProduct(p1,3);
        sc.addProduct(p2,1);
        sc.addProduct(p3,1);


        System.out.println("Cart total= " + sc.calculateTotal());
        System.out.println("Cart product= " + sc.addedProducts.toString());
    }

}
