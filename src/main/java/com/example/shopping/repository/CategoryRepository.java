package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping.model.Category;


@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
