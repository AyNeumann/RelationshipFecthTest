package com.aymeric.relationshipfetchtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aymeric.relationshipfetchtest.model.Cart;

@Repository
public interface CartRespository extends JpaRepository<Cart, Long>{

    /*
    @Query("SELECT c FROM Cart c WHERE c.id = (:id)")
    Optional<Cart> findById(@Param("id") Long id);
    */
}
