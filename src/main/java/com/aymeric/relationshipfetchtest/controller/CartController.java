package com.aymeric.relationshipfetchtest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aymeric.relationshipfetchtest.model.Cart;
import com.aymeric.relationshipfetchtest.service.CartService;

@RestController
@RequestMapping("carts")
public class CartController {
    
    @Autowired
    CartService cartService;

    @PostMapping("")
    public Cart create(@RequestBody @Valid Cart cart) {
        return cartService.createCart(cart);
    }
    
    @GetMapping("/{id}")
    public Cart getById(@PathVariable final Long id) {
        return cartService.getCartById(id);
    }
}
