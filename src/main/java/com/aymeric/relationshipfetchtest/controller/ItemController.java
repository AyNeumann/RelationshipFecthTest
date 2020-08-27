package com.aymeric.relationshipfetchtest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aymeric.relationshipfetchtest.model.Item;
import com.aymeric.relationshipfetchtest.service.ItemService;

@RestController
@RequestMapping("items")
public class ItemController {
    
    @Autowired
    ItemService itemService;
    
    @PostMapping("")
    public Item create(@RequestBody @Valid Item item) {
        return itemService.createCart(item);
    }
    
    @GetMapping("id/{id}")
    public Item getById(@PathVariable final Long id) {
        return itemService.getItemById(id);
    }
    
    @GetMapping("name/{name}")
    public List<Item> getByName(@PathVariable final String name) {
        return itemService.getItemByName(name);
    }

}
