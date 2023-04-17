package com.challenge.shoppingcart.builder;

import com.challenge.shoppingcart.response.ItemResponse;

import java.math.BigDecimal;

public class ItemResponseBuilder {

    private BigDecimal price;
    private String name;
    private Integer quantity;
    private String sku;

    public ItemResponseBuilder() {

    }

    public ItemResponseBuilder(BigDecimal price, String name, Integer quantity, String sku) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.sku = sku;
    }

    public ItemResponseBuilder withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ItemResponseBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ItemResponseBuilder withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ItemResponseBuilder withSku(String sku) {
        this.sku = sku;
        return this;
    }

    public ItemResponse build() {
        ItemResponse item = new ItemResponse();
        item.setPrice(this.price);
        item.setName(this.name);
        item.setQuantity(this.quantity);
        item.setSku(this.sku);
        return item;
    }
}
