package com.ita.week4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by deividi.silva on 24/03/2016.
 */
public class ProductTest {

    private ProductWithSize p = new ProductWithSize();

    @Before
    public void setup(){
        p.setName("produto");
        p.setCode("c1");
        p.setPrice(1f);
    }

    @Test
    public void testGetName() throws Exception {
        assertThat("produto", equalTo(p.getName()));
    }

    @Test
    public void testGetCode() throws Exception {
        assertThat("c1", equalTo(p.getCode()));
    }

    @Test
    public void testGetPrice() throws Exception {
        assertThat(1f, equalTo(p.getPrice()));
    }

    @Test
    public void testEquals() throws Exception {
        ProductWithSize p2 = new ProductWithSize();
        p2.setCode("c1");
        assertTrue(p.equals(p2));
    }

    @Test
    public void testHashCode() throws Exception {
        ProductWithSize p2 = new ProductWithSize();
        p2.setCode("c1");
        assertThat(p2.hashCode(), equalTo(p.hashCode()));
    }
}