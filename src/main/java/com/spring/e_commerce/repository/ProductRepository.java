package com.spring.e_commerce.repository;

import com.spring.e_commerce.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
