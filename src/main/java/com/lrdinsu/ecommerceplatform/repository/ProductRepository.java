package com.lrdinsu.ecommerceplatform.repository;

import com.lrdinsu.ecommerceplatform.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
