package com.aymeric.relationshipfetchtest.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aymeric.relationshipfetchtest.model.Item;
import com.aymeric.relationshipfetchtest.repository.ItemRepository;

@Service
public class ItemService {
    
    @Autowired
    ItemRepository itemRepository;

    public Item createCart(@Valid Item item) {
        return itemRepository.save(item);
    }

    public Item getItemById(Long id) {
        Optional<Item> item = itemRepository.findById(id);
        return item.get();
    }

    public List<Item> getItemByName(String name) {
        return itemRepository.findByName(name);
    }

}
