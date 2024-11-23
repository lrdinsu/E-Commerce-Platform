package com.lrdinsu.ecommerceplatform.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemKey implements Serializable {

    private Long orderId;
    private Long productId;

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemKey)) return false;
        OrderItemKey that = (OrderItemKey) o;
        return getOrderId().equals(that.getOrderId()) && getProductId().equals(that.getProductId());
    }

    @Override
    public int hashCode() {
        return 31;
    }
}