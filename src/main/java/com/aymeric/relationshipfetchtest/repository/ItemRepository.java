package com.aymeric.relationshipfetchtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aymeric.relationshipfetchtest.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

    List<Item> findByName(String name);  
}
