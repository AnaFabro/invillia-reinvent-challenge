package com.challenge.shoppingcart.response;

import com.challenge.shoppingcart.builder.CartResponseBuilder;
import com.challenge.shoppingcart.entity.ItemEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CartResponse implements Serializable {

    private List<ItemEntity> items;
    private BigDecimal total;


    public static CartResponseBuilder builder() {
        return new CartResponseBuilder();
    }

    public List<ItemEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemEntity> items) {
        this.items = items;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
