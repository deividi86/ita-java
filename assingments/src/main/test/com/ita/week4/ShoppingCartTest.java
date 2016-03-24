package com.ita.week4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ita.week2.*;

/**
 * Created by deividi.silva on 24/03/2016.
 */
public class ShoppingCartTest {

    private ProductWithSize p = new ProductWithSize();
    private ShoppingCart sc = new ShoppingCart();

    @Before
    public void setup(){
        p.setName("produto");
        p.setCode("c1");
        p.setPrice(17.30f);
        p.setSize(1);
    }

    @Test
    public void testAddProductNoQuantity() throws Exception {
        sc.addProduct(p, 0);
        assertThat(0, equalTo(sc.addedProducts.size()));
    }

    @Test
    public void testAddProductOneQuantity() throws Exception {
        sc.addProduct(p, 1);
        assertThat(1, equalTo(sc.addedProducts.get(p)));
    }

    @Test
    public void testAddSameProductTwice() throws Exception {
        ProductWithSize p2 = new ProductWithSize();
        p2.setName("produto");
        p2.setCode("c1");
        p2.setPrice(17.30f);
        p2.setSize(1);
        sc.addProduct(p, 1);
        sc.addProduct(p2, 5);
        assertThat(6, equalTo(sc.addedProducts.get(p)));
    }

    @Test
    public void testAddSameProductDifferentSizes() throws Exception {
        ProductWithSize p2 = new ProductWithSize();
        p2.setName("produto");
        p2.setCode("c1");
        p2.setPrice(17.30f);
        p2.setSize(2);
        sc.addProduct(p, 1);
        sc.addProduct(p2, 5);
        assertThat(1, equalTo(sc.addedProducts.get(p)));
    }

    @Test
    public void testAddDistinctProducts() throws Exception {
        ProductWithSize p2 = new ProductWithSize();
        p2.setName("produto");
        p2.setCode("c2");
        p2.setPrice(17.30f);
        p2.setSize(1);
        sc.addProduct(p, 1);
        sc.addProduct(p2, 5);
        assertThat(1, equalTo(sc.addedProducts.get(p)));
    }

    @Test
    public void testRemoveProduct() throws Exception {
        sc.addProduct(p, 4);
        sc.removeProduct(p, 2);
        assertThat(2, equalTo(sc.addedProducts.get(p)));
    }

    @Test
    public void testRemoveProductOverQuantity() throws Exception {
        sc.addProduct(p, 4);
        sc.removeProduct(p, 5);
        assertThat(4, equalTo(sc.addedProducts.get(p)));
    }

    @Test
    public void testCalculateTotal() throws Exception {
        sc.addProduct(p, 4);
        assertThat(69.2f, equalTo(sc.calculateTotal()));
    }
}