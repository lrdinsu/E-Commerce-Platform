package com.lrdinsu.ecommerceplatform.dto.CartDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

    private List<CartItemDTO> items;
    private Long totalPrice;
}
