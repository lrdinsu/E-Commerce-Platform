package com.lrdinsu.ecommerceplatform.repository;

import com.lrdinsu.ecommerceplatform.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
