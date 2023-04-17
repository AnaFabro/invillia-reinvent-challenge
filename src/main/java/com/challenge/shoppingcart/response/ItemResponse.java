package com.challenge.shoppingcart.response;

import com.challenge.shoppingcart.builder.ItemResponseBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemResponse implements Serializable {

    private String sku;
    private BigDecimal price;
    private String name;
    private Integer quantity;

    public static ItemResponseBuilder builder() {
        return new ItemResponseBuilder();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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
