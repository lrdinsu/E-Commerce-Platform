package com.lrdinsu.ecommerceplatform.repository;

import com.lrdinsu.ecommerceplatform.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
