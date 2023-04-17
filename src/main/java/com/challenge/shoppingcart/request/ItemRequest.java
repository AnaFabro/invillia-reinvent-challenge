package com.challenge.shoppingcart.request;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemRequest implements Serializable {

    private BigDecimal price;
    private String name;
    private Integer quantity;

    public ItemRequest(BigDecimal price, String name, Integer quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
