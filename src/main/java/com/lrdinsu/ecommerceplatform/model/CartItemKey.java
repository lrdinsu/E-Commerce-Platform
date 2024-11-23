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
public class CartItemKey implements Serializable {

    private Long cartId;
    private Long productId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartItemKey)) return false;
        CartItemKey that = (CartItemKey) o;
        return getCartId().equals(that.getCartId()) && getProductId().equals(that.getProductId());
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
