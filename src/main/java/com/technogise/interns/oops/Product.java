package com.technogise.interns.oops;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
   private  String name;
    private BigDecimal price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }
    Product(String name, BigDecimal price){
        this.name=name;
        this.price=price;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
