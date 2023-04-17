package com.challenge.shoppingcart.service;

import com.challenge.shoppingcart.builder.CartResponseBuilder;
import com.challenge.shoppingcart.entity.ItemEntity;
import com.challenge.shoppingcart.repository.ItemRepository;
import com.challenge.shoppingcart.response.ItemResponse;
import com.challenge.shoppingcart.response.CartResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional
    public ItemResponse add(ItemEntity item) {
        ItemEntity itemSaved = itemRepository.save(item);
        return ItemResponse.builder()
                .withName(itemSaved.getName())
                .withPrice(itemSaved.getPrice())
                .withSku(itemSaved.getSku())
                .withQuantity(itemSaved.getQuantity())
                .build();
    }
    public CartResponse findByUserId(Long userId) {
       List<ItemEntity> items = itemRepository.findByUserId(userId);
        return CartResponse.builder().withItems(items).withTotal(sumItemsPrice(items)).build();
    };

    private BigDecimal sumItemsPrice(List<ItemEntity> items) {
        BigDecimal sum = BigDecimal.ZERO;
        for (ItemEntity i: items) {
            sum = sum.add(i.getPrice());
        }
        return sum;
    }
}
