package com.hex.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hex.pm.model.Product;

@Repository
public interface ProductRepostory extends JpaRepository<Product, Integer> {

}
