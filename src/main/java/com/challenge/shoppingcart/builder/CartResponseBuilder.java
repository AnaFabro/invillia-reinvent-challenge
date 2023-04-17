package com.challenge.shoppingcart.builder;

import com.challenge.shoppingcart.entity.ItemEntity;
import com.challenge.shoppingcart.response.CartResponse;

import java.math.BigDecimal;
import java.util.List;

public class CartResponseBuilder {


    private List<ItemEntity> items;
    private BigDecimal total;

    public CartResponseBuilder(){};

    public CartResponseBuilder(List<ItemEntity> items, BigDecimal total) {
        this.items = items;
        this.total = total;
    }

    public CartResponseBuilder withItems(List<ItemEntity> items) {
        this.items = items;
        return this;
    }

    public CartResponseBuilder withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public CartResponse build() {
        CartResponse cart = new CartResponse();
        cart.setItems(this.items);
        cart.setTotal(this.total);
        return cart;
    }
}
