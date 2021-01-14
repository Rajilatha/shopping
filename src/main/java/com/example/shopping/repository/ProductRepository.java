package com.example.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping.model.Product;



@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findProductByCategoryId(Integer categoryId);

}
