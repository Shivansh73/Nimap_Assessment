package com.example.demo.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
     @SuppressWarnings("null")
     @Override
     Page<Product>findAll(Pageable pageable);
}







































//Name : - Shivansh Dubey
//Batch : - JSD Delhi Batch
//Mob :- 8109996164
//Email : - shivanshdubey73@gmail.com