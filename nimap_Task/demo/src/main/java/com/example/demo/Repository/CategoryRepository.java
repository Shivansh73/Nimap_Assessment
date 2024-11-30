package com.example.demo.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
    @SuppressWarnings("null")
    @Override
    Page<Category>findAll(Pageable pageable);
}











































//Name : - Shivansh Dubey
//Batch : - JSD Delhi Batch
//Mob :- 8109996164
//Email : - shivanshdubey73@gmail.com