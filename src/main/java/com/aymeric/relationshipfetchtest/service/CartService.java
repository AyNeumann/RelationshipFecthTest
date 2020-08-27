package com.aymeric.relationshipfetchtest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aymeric.relationshipfetchtest.model.Cart;
import com.aymeric.relationshipfetchtest.repository.CartRespository;

@Service
public class CartService {
    
    @Autowired
    CartRespository cartRespository;

    public Cart createCart(final Cart cart) {
        return cartRespository.save(cart);
    }

    public Cart getCartById(Long id) {
        Optional<Cart> cart = cartRespository.findById(id);
        return cart.get();
    }
}
