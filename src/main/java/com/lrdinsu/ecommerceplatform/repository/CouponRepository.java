package com.lrdinsu.ecommerceplatform.repository;

import com.lrdinsu.ecommerceplatform.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
