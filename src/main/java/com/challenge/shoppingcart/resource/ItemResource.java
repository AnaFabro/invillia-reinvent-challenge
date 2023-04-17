package com.challenge.shoppingcart.resource;

import com.challenge.shoppingcart.entity.ItemEntity;
import com.challenge.shoppingcart.request.ItemRequest;
import com.challenge.shoppingcart.response.ItemResponse;
import com.challenge.shoppingcart.response.CartResponse;
import com.challenge.shoppingcart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shopping-cart")
public class ItemResource {

    private final ItemService itemService;


    @Autowired
    public ItemResource(final ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping(value = "/{userId}/items/{sku}")
    public ResponseEntity<ItemResponse> addItem(
            @PathVariable("userId") final Long userId,
            @PathVariable("sku") final String sku,
            @RequestBody ItemRequest itemRequest) {
        return new ResponseEntity<>(
                itemService.add(ItemEntity.builder()
                        .withName(itemRequest.getName())
                        .withPrice(itemRequest.getPrice())
                        .withQuantity(itemRequest.getQuantity())
                        .withSku(sku)
                        .withUserId(userId)
                        .build()
                ), HttpStatus.CREATED
        );
    }

    @GetMapping(path="/<userId>")
    public ResponseEntity<CartResponse> getCart(@PathVariable("userId") Long userId) {
        return new ResponseEntity<>(itemService.findByUserId(userId), HttpStatus.OK);
    }





}
