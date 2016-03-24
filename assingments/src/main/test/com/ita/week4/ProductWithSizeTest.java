package com.ita.week4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by deividi.silva on 24/03/2016.
 */
public class ProductWithSizeTest {

    private ProductWithSize p = new ProductWithSize();

    @Before
    public void setup(){
        p.setName("produto");
        p.setCode("c1");
        p.setPrice(1f);
        p.setSize(1);
    }

    @Test
    public void testGetSize() throws Exception {
        assertThat(1, equalTo(p.getSize()));
    }

    @Test
    public void testEquals() throws Exception {
        ProductWithSize p2 = new ProductWithSize();
        p2.setCode("c1");
        p2.setSize(1);
        assertTrue(p.equals(p2));
    }

    @Test
    public void testNotEquals() throws Exception {
        ProductWithSize p2 = new ProductWithSize();
        p2.setCode("c1");
        p2.setSize(2);
        assertFalse(p.equals(p2));
    }

    @Test
    public void testHashCode() throws Exception {
        ProductWithSize p2 = new ProductWithSize();
        p2.setCode("c1");
        p2.setSize(1);
        assertThat(p2.hashCode(), equalTo(p.hashCode()));
    }
}