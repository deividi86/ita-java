package com.ita.week4;

import java.util.Objects;

/**
 * Created by deividi.silva on 18/03/2016.
 */
public class ProductWithSize extends Product {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        ProductWithSize that = (ProductWithSize) o;
        return super.equals(o) && size == that.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
