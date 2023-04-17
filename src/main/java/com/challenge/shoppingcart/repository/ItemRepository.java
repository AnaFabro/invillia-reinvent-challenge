package com.challenge.shoppingcart.repository;

import com.challenge.shoppingcart.entity.ItemEntity;
import com.challenge.shoppingcart.response.ItemResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, String> {

    List<ItemEntity> findByUserId(Long userId);


}
