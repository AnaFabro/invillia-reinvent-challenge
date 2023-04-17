package com.challenge.shoppingcart.builder;

import com.challenge.shoppingcart.entity.ItemEntity;

import java.math.BigDecimal;

public class ItemEntityBuilder {

    private BigDecimal price;
    private String name;
    private Integer quantity;
    private String sku;
    public ItemEntityBuilder() {

    }

    public ItemEntityBuilder(BigDecimal price, String name, Integer quantity, String sku, Long userId) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.sku = sku;
    }

    public ItemEntityBuilder withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ItemEntityBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ItemEntityBuilder withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ItemEntityBuilder withSku(String sku) {
        this.sku = sku;
        return this;
    }

    public ItemEntityBuilder withUserId(Long userId) {
        return this;
    }

    public ItemEntity build() {
        ItemEntity item = new ItemEntity();
        item.setPrice(this.price);
        item.setName(this.name);
        item.setQuantity(this.quantity);
        item.setSku(this.sku);
        return item;
    }
}
